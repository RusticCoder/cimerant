package cimerant.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.StringUtils;

/** General file manipulation utilities. */
public class DirUtils {
  /**
   * Determine if the directory paths and files are identical between the source and destination.
   *
   * @param sourceFilePath the source path to be compared.
   * @param destinationFilePath the destination path to be compared.
   * @return Returns {@code true} if the content of the files are equal or they both don't exist,
   *     otherwise {@code false}.
   * @throws IOException If an I/O error occurs.
   */
  public static boolean contentEquals(final Path sourceFilePath, final Path destinationFilePath)
      throws IOException {
    final Iterator<File> sourceIterator;
    final Iterator<File> destinationIterator;

    {
      final Comparator<File> fileComparator =
          (sourceFile, destinationFile) ->
              StringUtils.compare(
                  sourceFile.getAbsolutePath(), destinationFile.getAbsolutePath(), true);

      final int sourceFilesSize;
      {
        if (!Files.exists(sourceFilePath) || !Files.isDirectory(sourceFilePath)) {
          return false;
        }
        final var sourceFiles =
            new ArrayList<>(
                FileUtils.listFiles(
                    sourceFilePath.toFile(), TrueFileFilter.TRUE, TrueFileFilter.TRUE));
        sourceFilesSize = sourceFiles.size();
        Collections.sort(sourceFiles, fileComparator);
        sourceIterator = sourceFiles.iterator();
      }

      final int destinationFilesSize;
      {
        if (!Files.exists(destinationFilePath) || !Files.isDirectory(destinationFilePath)) {
          return false;
        }
        final var destinationFiles =
            new ArrayList<>(
                FileUtils.listFiles(
                    destinationFilePath.toFile(), TrueFileFilter.TRUE, TrueFileFilter.TRUE));
        destinationFilesSize = destinationFiles.size();
        Collections.sort(destinationFiles, fileComparator);
        destinationIterator = destinationFiles.iterator();
      }

      if (sourceFilesSize != destinationFilesSize) {
        return false;
      }
    }

    var returnValue = true;
    while (sourceIterator.hasNext() && returnValue) {
      final var sourceFile = sourceIterator.next();
      final var destinationFile = destinationIterator.next();

      returnValue =
          sourceFilePath
                  .relativize(sourceFile.toPath())
                  .toString()
                  .equals(destinationFilePath.relativize(destinationFile.toPath()).toString())
              && FileUtils.contentEquals(sourceFile, destinationFile);
    }

    return returnValue;
  }
}
