Feature: Multiple Templates

  # The system will fail with an appropriate error message when the file name includes ${CLASS_NAME} as a variable but it is a single file.
  @singleTemplateDynamic
  Scenario Outline: singleTemplateDynamic
    Given singleTemplateDynamic.<pUnique> JSON file to be transformed <pInputFile>
    * singleTemplateDynamic.<pUnique> template to use to transform the JSON <pTemplate>
    * singleTemplateDynamic.<pUnique> single multi value <pSinti>
    * singleTemplateDynamic.<pUnique> path <pPath>
    * singleTemplateDynamic.<pUnique> file <pFile>
    * singleTemplateDynamic.<pUnique> var <pVar>
    * singleTemplateDynamic.<pUnique> vars <pVars>
    When singleTemplateDynamic.<pUnique> the values are passed into Cimerant
    Then singleTemplateDynamic.<pUnique> an identical file is produced

    Examples:
      | pUnique | pInputFile | pTemplate  | pTemplates | pSinti   | pPath  | pFile  | pVar   | pVars       |
      | 1       | "input"    | "template" | ""         | "single" | "path" | "file" | "keys" | "variables" |
