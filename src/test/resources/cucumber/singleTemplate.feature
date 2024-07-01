Feature: Multiple Templates

  # The user will be able to combine a Velocity template and a JSON file to transform the JSON into language specific files.
  @singleTemplate
  Scenario Outline: singleTemplate
    Given singleTemplate.<pUnique> JSON file to be transformed <pInputFile>
    * singleTemplate.<pUnique> template to use to transform the JSON <pTemplate>
    * singleTemplate.<pUnique> single multi value <pSinti>
    * singleTemplate.<pUnique> path <pPath>
    * singleTemplate.<pUnique> file <pFile>
    * singleTemplate.<pUnique> var <pVar>
    * singleTemplate.<pUnique> vars <pVars>
    When singleTemplate.<pUnique> the values are passed into Cimerant
    Then singleTemplate.<pUnique> an identical file is produced

    Examples:
      | pUnique | pInputFile | pTemplate  | pTemplates | pSinti   | pPath  | pFile  | pVar   | pVars       |
      | 1       | "input"    | "template" | ""         | "single" | "path" | "file" | "keys" | "variables" |
