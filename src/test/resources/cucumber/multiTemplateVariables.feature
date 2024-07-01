Feature: Multiple Templates

  # The user will be able to combine multiple Velocity templates and a single JSON file to transform the JSON into language specific files. The user will be able to pass in the following command line values.
  @multiTemplateVariables
  Scenario Outline: multiTemplateVariables
    Given multiTemplateVariables.<pUnique> JSON file to be transformed <pInputFile>
    * multiTemplateVariables.<pUnique> a list of templates to use to transform the JSON <pTemplates>
    * multiTemplateVariables.<pUnique> single multi value <pSinti>
    * multiTemplateVariables.<pUnique> path <pPath>
    * multiTemplateVariables.<pUnique> file <pFile>
    * multiTemplateVariables.<pUnique> var <pVar>
    * multiTemplateVariables.<pUnique> vars <pVars>
    When multiTemplateVariables.<pUnique> the values are passed into Cimerant
    Then multiTemplateVariables.<pUnique> an identical file is produced

    Examples:
      | pUnique | pInputFile | pTemplate | pTemplates  | pSinti | pPath  | pFile | pVar   | pVars       |
      | 1       | "input"    | ""        | "templates" | ""     | "path" | ""    | "keys" | "variables" |
