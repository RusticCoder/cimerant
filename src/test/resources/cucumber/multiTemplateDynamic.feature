Feature: Multiple Templates

  # The user will be able to combine multiple Velocity templates and a single JSON file to transform the JSON into language specific files. The user will be able to pass in the following command line values.
  @multiTemplateDynamic
  Scenario Outline: multiTemplateDynamic
    Given multiTemplateDynamic.<pUnique> JSON file to be transformed <pInputFile>
    * multiTemplateDynamic.<pUnique> a list of templates to use to transform the JSON <pTemplates>
    * multiTemplateDynamic.<pUnique> single multi value <pSinti>
    * multiTemplateDynamic.<pUnique> path <pPath>
    * multiTemplateDynamic.<pUnique> file <pFile>
    * multiTemplateDynamic.<pUnique> var <pVar>
    * multiTemplateDynamic.<pUnique> vars <pVars>
    When multiTemplateDynamic.<pUnique> the values are passed into Cimerant
    Then multiTemplateDynamic.<pUnique> an identical file is produced

    Examples:
      | pUnique | pInputFile | pTemplate | pTemplates  | pSinti | pPath  | pFile | pVar   | pVars       |
      | 1       | "input"    | ""        | "templates" | ""     | "path" | ""    | "keys" | "variables" |
