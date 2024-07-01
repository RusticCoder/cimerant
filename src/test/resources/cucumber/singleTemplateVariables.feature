Feature: Multiple Templates

  # The user will be able to input variables via the command line and the template list which will be available to the templates in the list.
  @singleTemplateVariables
  Scenario Outline: singleTemplateVariables
    Given singleTemplateVariables.<pUnique> JSON file to be transformed <pInputFile>
    * singleTemplateVariables.<pUnique> template to use to transform the JSON <pTemplate>
    * singleTemplateVariables.<pUnique> single multi value <pSinti>
    * singleTemplateVariables.<pUnique> path <pPath>
    * singleTemplateVariables.<pUnique> file <pFile>
    * singleTemplateVariables.<pUnique> var <pVar>
    * singleTemplateVariables.<pUnique> vars <pVars>
    When singleTemplateVariables.<pUnique> the values are passed into Cimerant
    Then singleTemplateVariables.<pUnique> an identical file is produced

    Examples:
      | pUnique | pInputFile | pTemplate  | pTemplates | pSinti   | pPath  | pFile  | pVar   | pVars       |
      | 1       | "input"    | "template" | ""         | "single" | "path" | "file" | "keys" | "variables" |
