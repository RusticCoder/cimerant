Feature: Multiple Templates

  # The user will be able to combine a Velocity template and a JSON file to transform the JSON into language specific files.
  @singleTemplateStatic
  Scenario Outline: singleTemplateStatic
    Given singleTemplateStatic.<pUnique> JSON file to be transformed <pInputFile>
    * singleTemplateStatic.<pUnique> template to use to transform the JSON <pTemplate>
    * singleTemplateStatic.<pUnique> single multi value <pSinti>
    * singleTemplateStatic.<pUnique> path <pPath>
    * singleTemplateStatic.<pUnique> file <pFile>
    * singleTemplateStatic.<pUnique> var <pVar>
    * singleTemplateStatic.<pUnique> vars <pVars>
    When singleTemplateStatic.<pUnique> the values are passed into Cimerant
    Then singleTemplateStatic.<pUnique> an identical file is produced

    Examples:
      | pUnique | pInputFile | pTemplate  | pTemplates | pSinti   | pPath  | pFile  | pVar   | pVars       |
      | 1       | "input"    | "template" | ""         | "single" | "path" | "file" | "keys" | "variables" |
