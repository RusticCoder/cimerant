Feature: Upper First

  # The user will be able to combine a Velocity template and a formatted file to transform the values to upper first.
  @upperFirstTemplate
  Scenario Outline: Template
    Given upperFirstTemplate.<pUnique> input file <pInputFile>
    * upperFirstTemplate.<pUnique> template <pTemplate>
    * upperFirstTemplate.<pUnique> templates <pTemplates>
    * upperFirstTemplate.<pUnique> single multi value <pSinti>
    * upperFirstTemplate.<pUnique> path <pPath>
    * upperFirstTemplate.<pUnique> file <pFile>
    * upperFirstTemplate.<pUnique> var <pVar>
    * upperFirstTemplate.<pUnique> vars <pVars>
    When upperFirstTemplate.<pUnique> the values are passed into Cimerant
    Then upperFirstTemplate.<pUnique> values are converted according to the template

    Examples:
      | pUnique | pInputFile | pTemplate  | pTemplates  | pSinti   | pPath  | pFile  | pVar   | pVars       |
      | 2026    | "i"        | "t"        | ""          | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2027    | "i"        | "t"        | ""          | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 2028    | "i"        | "t"        | ""          | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 2032    | "i"        | "t"        | ""          | "multi"  | "p"    | "file" | "keys" | ""          |
      | 2033    | "i"        | "t"        | ""          | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 2034    | "i"        | "t"        | ""          | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 2044    | "i"        | "t"        | ""          | "multi"  | "path" | "f"    | "keys" | ""          |
      | 2045    | "i"        | "t"        | ""          | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 2046    | "i"        | "t"        | ""          | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 2050    | "i"        | "t"        | ""          | "multi"  | "path" | "file" | "keys" | ""          |
      | 2051    | "i"        | "t"        | ""          | "multi"  | "path" | "file" | "keys" | "variables" |
      | 2052    | "i"        | "t"        | ""          | "multi"  | "path" | "file" | "keys" | "x"         |
      | 2080    | "i"        | "t"        | ""          | "single" | "p"    | "f"    | "keys" | ""          |
      | 2081    | "i"        | "t"        | ""          | "single" | "p"    | "f"    | "keys" | "variables" |
      | 2082    | "i"        | "t"        | ""          | "single" | "p"    | "f"    | "keys" | "x"         |
      | 2086    | "i"        | "t"        | ""          | "single" | "p"    | "file" | "keys" | ""          |
      | 2087    | "i"        | "t"        | ""          | "single" | "p"    | "file" | "keys" | "variables" |
      | 2088    | "i"        | "t"        | ""          | "single" | "p"    | "file" | "keys" | "x"         |
      | 2098    | "i"        | "t"        | ""          | "single" | "path" | "f"    | "keys" | ""          |
      | 2099    | "i"        | "t"        | ""          | "single" | "path" | "f"    | "keys" | "variables" |
      | 2100    | "i"        | "t"        | ""          | "single" | "path" | "f"    | "keys" | "x"         |
      | 2104    | "i"        | "t"        | ""          | "single" | "path" | "file" | "keys" | ""          |
      | 2105    | "i"        | "t"        | ""          | "single" | "path" | "file" | "keys" | "variables" |
      | 2106    | "i"        | "t"        | ""          | "single" | "path" | "file" | "keys" | "x"         |
      | 2188    | "i"        | "t"        | "l"         | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2189    | "i"        | "t"        | "l"         | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 2190    | "i"        | "t"        | "l"         | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 2194    | "i"        | "t"        | "l"         | "multi"  | "p"    | "file" | "keys" | ""          |
      | 2195    | "i"        | "t"        | "l"         | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 2196    | "i"        | "t"        | "l"         | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 2206    | "i"        | "t"        | "l"         | "multi"  | "path" | "f"    | "keys" | ""          |
      | 2207    | "i"        | "t"        | "l"         | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 2208    | "i"        | "t"        | "l"         | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 2212    | "i"        | "t"        | "l"         | "multi"  | "path" | "file" | "keys" | ""          |
      | 2213    | "i"        | "t"        | "l"         | "multi"  | "path" | "file" | "keys" | "variables" |
      | 2214    | "i"        | "t"        | "l"         | "multi"  | "path" | "file" | "keys" | "x"         |
      | 2242    | "i"        | "t"        | "l"         | "single" | "p"    | "f"    | "keys" | ""          |
      | 2243    | "i"        | "t"        | "l"         | "single" | "p"    | "f"    | "keys" | "variables" |
      | 2244    | "i"        | "t"        | "l"         | "single" | "p"    | "f"    | "keys" | "x"         |
      | 2248    | "i"        | "t"        | "l"         | "single" | "p"    | "file" | "keys" | ""          |
      | 2249    | "i"        | "t"        | "l"         | "single" | "p"    | "file" | "keys" | "variables" |
      | 2250    | "i"        | "t"        | "l"         | "single" | "p"    | "file" | "keys" | "x"         |
      | 2260    | "i"        | "t"        | "l"         | "single" | "path" | "f"    | "keys" | ""          |
      | 2261    | "i"        | "t"        | "l"         | "single" | "path" | "f"    | "keys" | "variables" |
      | 2262    | "i"        | "t"        | "l"         | "single" | "path" | "f"    | "keys" | "x"         |
      | 2266    | "i"        | "t"        | "l"         | "single" | "path" | "file" | "keys" | ""          |
      | 2267    | "i"        | "t"        | "l"         | "single" | "path" | "file" | "keys" | "variables" |
      | 2268    | "i"        | "t"        | "l"         | "single" | "path" | "file" | "keys" | "x"         |
      | 2350    | "i"        | "t"        | "templates" | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2351    | "i"        | "t"        | "templates" | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 2352    | "i"        | "t"        | "templates" | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 2356    | "i"        | "t"        | "templates" | "multi"  | "p"    | "file" | "keys" | ""          |
      | 2357    | "i"        | "t"        | "templates" | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 2358    | "i"        | "t"        | "templates" | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 2368    | "i"        | "t"        | "templates" | "multi"  | "path" | "f"    | "keys" | ""          |
      | 2369    | "i"        | "t"        | "templates" | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 2370    | "i"        | "t"        | "templates" | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 2374    | "i"        | "t"        | "templates" | "multi"  | "path" | "file" | "keys" | ""          |
      | 2375    | "i"        | "t"        | "templates" | "multi"  | "path" | "file" | "keys" | "variables" |
      | 2376    | "i"        | "t"        | "templates" | "multi"  | "path" | "file" | "keys" | "x"         |
      | 2404    | "i"        | "t"        | "templates" | "single" | "p"    | "f"    | "keys" | ""          |
      | 2405    | "i"        | "t"        | "templates" | "single" | "p"    | "f"    | "keys" | "variables" |
      | 2406    | "i"        | "t"        | "templates" | "single" | "p"    | "f"    | "keys" | "x"         |
      | 2410    | "i"        | "t"        | "templates" | "single" | "p"    | "file" | "keys" | ""          |
      | 2411    | "i"        | "t"        | "templates" | "single" | "p"    | "file" | "keys" | "variables" |
      | 2412    | "i"        | "t"        | "templates" | "single" | "p"    | "file" | "keys" | "x"         |
      | 2422    | "i"        | "t"        | "templates" | "single" | "path" | "f"    | "keys" | ""          |
      | 2423    | "i"        | "t"        | "templates" | "single" | "path" | "f"    | "keys" | "variables" |
      | 2424    | "i"        | "t"        | "templates" | "single" | "path" | "f"    | "keys" | "x"         |
      | 2428    | "i"        | "t"        | "templates" | "single" | "path" | "file" | "keys" | ""          |
      | 2429    | "i"        | "t"        | "templates" | "single" | "path" | "file" | "keys" | "variables" |
      | 2430    | "i"        | "t"        | "templates" | "single" | "path" | "file" | "keys" | "x"         |
      | 2512    | "i"        | "template" | ""          | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2513    | "i"        | "template" | ""          | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 2514    | "i"        | "template" | ""          | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 2518    | "i"        | "template" | ""          | "multi"  | "p"    | "file" | "keys" | ""          |
      | 2519    | "i"        | "template" | ""          | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 2520    | "i"        | "template" | ""          | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 2530    | "i"        | "template" | ""          | "multi"  | "path" | "f"    | "keys" | ""          |
      | 2531    | "i"        | "template" | ""          | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 2532    | "i"        | "template" | ""          | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 2536    | "i"        | "template" | ""          | "multi"  | "path" | "file" | "keys" | ""          |
      | 2537    | "i"        | "template" | ""          | "multi"  | "path" | "file" | "keys" | "variables" |
      | 2538    | "i"        | "template" | ""          | "multi"  | "path" | "file" | "keys" | "x"         |
      | 2566    | "i"        | "template" | ""          | "single" | "p"    | "f"    | "keys" | ""          |
      | 2567    | "i"        | "template" | ""          | "single" | "p"    | "f"    | "keys" | "variables" |
      | 2568    | "i"        | "template" | ""          | "single" | "p"    | "f"    | "keys" | "x"         |
      | 2572    | "i"        | "template" | ""          | "single" | "p"    | "file" | "keys" | ""          |
      | 2573    | "i"        | "template" | ""          | "single" | "p"    | "file" | "keys" | "variables" |
      | 2574    | "i"        | "template" | ""          | "single" | "p"    | "file" | "keys" | "x"         |
      | 2584    | "i"        | "template" | ""          | "single" | "path" | "f"    | "keys" | ""          |
      | 2585    | "i"        | "template" | ""          | "single" | "path" | "f"    | "keys" | "variables" |
      | 2586    | "i"        | "template" | ""          | "single" | "path" | "f"    | "keys" | "x"         |
      | 2590    | "i"        | "template" | ""          | "single" | "path" | "file" | "keys" | ""          |
      | 2591    | "i"        | "template" | ""          | "single" | "path" | "file" | "keys" | "variables" |
      | 2592    | "i"        | "template" | ""          | "single" | "path" | "file" | "keys" | "x"         |
      | 2674    | "i"        | "template" | "l"         | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2675    | "i"        | "template" | "l"         | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 2676    | "i"        | "template" | "l"         | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 2680    | "i"        | "template" | "l"         | "multi"  | "p"    | "file" | "keys" | ""          |
      | 2681    | "i"        | "template" | "l"         | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 2682    | "i"        | "template" | "l"         | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 2692    | "i"        | "template" | "l"         | "multi"  | "path" | "f"    | "keys" | ""          |
      | 2693    | "i"        | "template" | "l"         | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 2694    | "i"        | "template" | "l"         | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 2698    | "i"        | "template" | "l"         | "multi"  | "path" | "file" | "keys" | ""          |
      | 2699    | "i"        | "template" | "l"         | "multi"  | "path" | "file" | "keys" | "variables" |
      | 2700    | "i"        | "template" | "l"         | "multi"  | "path" | "file" | "keys" | "x"         |
      | 2728    | "i"        | "template" | "l"         | "single" | "p"    | "f"    | "keys" | ""          |
      | 2729    | "i"        | "template" | "l"         | "single" | "p"    | "f"    | "keys" | "variables" |
      | 2730    | "i"        | "template" | "l"         | "single" | "p"    | "f"    | "keys" | "x"         |
      | 2734    | "i"        | "template" | "l"         | "single" | "p"    | "file" | "keys" | ""          |
      | 2735    | "i"        | "template" | "l"         | "single" | "p"    | "file" | "keys" | "variables" |
      | 2736    | "i"        | "template" | "l"         | "single" | "p"    | "file" | "keys" | "x"         |
      | 2746    | "i"        | "template" | "l"         | "single" | "path" | "f"    | "keys" | ""          |
      | 2747    | "i"        | "template" | "l"         | "single" | "path" | "f"    | "keys" | "variables" |
      | 2748    | "i"        | "template" | "l"         | "single" | "path" | "f"    | "keys" | "x"         |
      | 2752    | "i"        | "template" | "l"         | "single" | "path" | "file" | "keys" | ""          |
      | 2753    | "i"        | "template" | "l"         | "single" | "path" | "file" | "keys" | "variables" |
      | 2754    | "i"        | "template" | "l"         | "single" | "path" | "file" | "keys" | "x"         |
      | 2836    | "i"        | "template" | "templates" | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2837    | "i"        | "template" | "templates" | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 2838    | "i"        | "template" | "templates" | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 2842    | "i"        | "template" | "templates" | "multi"  | "p"    | "file" | "keys" | ""          |
      | 2843    | "i"        | "template" | "templates" | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 2844    | "i"        | "template" | "templates" | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 2854    | "i"        | "template" | "templates" | "multi"  | "path" | "f"    | "keys" | ""          |
      | 2855    | "i"        | "template" | "templates" | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 2856    | "i"        | "template" | "templates" | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 2860    | "i"        | "template" | "templates" | "multi"  | "path" | "file" | "keys" | ""          |
      | 2861    | "i"        | "template" | "templates" | "multi"  | "path" | "file" | "keys" | "variables" |
      | 2862    | "i"        | "template" | "templates" | "multi"  | "path" | "file" | "keys" | "x"         |
      | 2890    | "i"        | "template" | "templates" | "single" | "p"    | "f"    | "keys" | ""          |
      | 2891    | "i"        | "template" | "templates" | "single" | "p"    | "f"    | "keys" | "variables" |
      | 2892    | "i"        | "template" | "templates" | "single" | "p"    | "f"    | "keys" | "x"         |
      | 2896    | "i"        | "template" | "templates" | "single" | "p"    | "file" | "keys" | ""          |
      | 2897    | "i"        | "template" | "templates" | "single" | "p"    | "file" | "keys" | "variables" |
      | 2898    | "i"        | "template" | "templates" | "single" | "p"    | "file" | "keys" | "x"         |
      | 2908    | "i"        | "template" | "templates" | "single" | "path" | "f"    | "keys" | ""          |
      | 2909    | "i"        | "template" | "templates" | "single" | "path" | "f"    | "keys" | "variables" |
      | 2910    | "i"        | "template" | "templates" | "single" | "path" | "f"    | "keys" | "x"         |
      | 2914    | "i"        | "template" | "templates" | "single" | "path" | "file" | "keys" | ""          |
      | 2915    | "i"        | "template" | "templates" | "single" | "path" | "file" | "keys" | "variables" |
      | 2916    | "i"        | "template" | "templates" | "single" | "path" | "file" | "keys" | "x"         |
      | 3484    | "input"    | "t"        | ""          | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 3485    | "input"    | "t"        | ""          | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 3486    | "input"    | "t"        | ""          | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 3490    | "input"    | "t"        | ""          | "multi"  | "p"    | "file" | "keys" | ""          |
      | 3491    | "input"    | "t"        | ""          | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 3492    | "input"    | "t"        | ""          | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 3502    | "input"    | "t"        | ""          | "multi"  | "path" | "f"    | "keys" | ""          |
      | 3503    | "input"    | "t"        | ""          | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 3504    | "input"    | "t"        | ""          | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 3508    | "input"    | "t"        | ""          | "multi"  | "path" | "file" | "keys" | ""          |
      | 3509    | "input"    | "t"        | ""          | "multi"  | "path" | "file" | "keys" | "variables" |
      | 3510    | "input"    | "t"        | ""          | "multi"  | "path" | "file" | "keys" | "x"         |
      | 3538    | "input"    | "t"        | ""          | "single" | "p"    | "f"    | "keys" | ""          |
      | 3539    | "input"    | "t"        | ""          | "single" | "p"    | "f"    | "keys" | "variables" |
      | 3540    | "input"    | "t"        | ""          | "single" | "p"    | "f"    | "keys" | "x"         |
      | 3544    | "input"    | "t"        | ""          | "single" | "p"    | "file" | "keys" | ""          |
      | 3545    | "input"    | "t"        | ""          | "single" | "p"    | "file" | "keys" | "variables" |
      | 3546    | "input"    | "t"        | ""          | "single" | "p"    | "file" | "keys" | "x"         |
      | 3556    | "input"    | "t"        | ""          | "single" | "path" | "f"    | "keys" | ""          |
      | 3557    | "input"    | "t"        | ""          | "single" | "path" | "f"    | "keys" | "variables" |
      | 3558    | "input"    | "t"        | ""          | "single" | "path" | "f"    | "keys" | "x"         |
      | 3562    | "input"    | "t"        | ""          | "single" | "path" | "file" | "keys" | ""          |
      | 3563    | "input"    | "t"        | ""          | "single" | "path" | "file" | "keys" | "variables" |
      | 3564    | "input"    | "t"        | ""          | "single" | "path" | "file" | "keys" | "x"         |
      | 3646    | "input"    | "t"        | "l"         | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 3647    | "input"    | "t"        | "l"         | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 3648    | "input"    | "t"        | "l"         | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 3652    | "input"    | "t"        | "l"         | "multi"  | "p"    | "file" | "keys" | ""          |
      | 3653    | "input"    | "t"        | "l"         | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 3654    | "input"    | "t"        | "l"         | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 3664    | "input"    | "t"        | "l"         | "multi"  | "path" | "f"    | "keys" | ""          |
      | 3665    | "input"    | "t"        | "l"         | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 3666    | "input"    | "t"        | "l"         | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 3670    | "input"    | "t"        | "l"         | "multi"  | "path" | "file" | "keys" | ""          |
      | 3671    | "input"    | "t"        | "l"         | "multi"  | "path" | "file" | "keys" | "variables" |
      | 3672    | "input"    | "t"        | "l"         | "multi"  | "path" | "file" | "keys" | "x"         |
      | 3700    | "input"    | "t"        | "l"         | "single" | "p"    | "f"    | "keys" | ""          |
      | 3701    | "input"    | "t"        | "l"         | "single" | "p"    | "f"    | "keys" | "variables" |
      | 3702    | "input"    | "t"        | "l"         | "single" | "p"    | "f"    | "keys" | "x"         |
      | 3706    | "input"    | "t"        | "l"         | "single" | "p"    | "file" | "keys" | ""          |
      | 3707    | "input"    | "t"        | "l"         | "single" | "p"    | "file" | "keys" | "variables" |
      | 3708    | "input"    | "t"        | "l"         | "single" | "p"    | "file" | "keys" | "x"         |
      | 3718    | "input"    | "t"        | "l"         | "single" | "path" | "f"    | "keys" | ""          |
      | 3719    | "input"    | "t"        | "l"         | "single" | "path" | "f"    | "keys" | "variables" |
      | 3720    | "input"    | "t"        | "l"         | "single" | "path" | "f"    | "keys" | "x"         |
      | 3724    | "input"    | "t"        | "l"         | "single" | "path" | "file" | "keys" | ""          |
      | 3725    | "input"    | "t"        | "l"         | "single" | "path" | "file" | "keys" | "variables" |
      | 3726    | "input"    | "t"        | "l"         | "single" | "path" | "file" | "keys" | "x"         |
      | 3808    | "input"    | "t"        | "templates" | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 3809    | "input"    | "t"        | "templates" | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 3810    | "input"    | "t"        | "templates" | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 3814    | "input"    | "t"        | "templates" | "multi"  | "p"    | "file" | "keys" | ""          |
      | 3815    | "input"    | "t"        | "templates" | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 3816    | "input"    | "t"        | "templates" | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 3826    | "input"    | "t"        | "templates" | "multi"  | "path" | "f"    | "keys" | ""          |
      | 3827    | "input"    | "t"        | "templates" | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 3828    | "input"    | "t"        | "templates" | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 3832    | "input"    | "t"        | "templates" | "multi"  | "path" | "file" | "keys" | ""          |
      | 3833    | "input"    | "t"        | "templates" | "multi"  | "path" | "file" | "keys" | "variables" |
      | 3834    | "input"    | "t"        | "templates" | "multi"  | "path" | "file" | "keys" | "x"         |
      | 3862    | "input"    | "t"        | "templates" | "single" | "p"    | "f"    | "keys" | ""          |
      | 3863    | "input"    | "t"        | "templates" | "single" | "p"    | "f"    | "keys" | "variables" |
      | 3864    | "input"    | "t"        | "templates" | "single" | "p"    | "f"    | "keys" | "x"         |
      | 3868    | "input"    | "t"        | "templates" | "single" | "p"    | "file" | "keys" | ""          |
      | 3869    | "input"    | "t"        | "templates" | "single" | "p"    | "file" | "keys" | "variables" |
      | 3870    | "input"    | "t"        | "templates" | "single" | "p"    | "file" | "keys" | "x"         |
      | 3880    | "input"    | "t"        | "templates" | "single" | "path" | "f"    | "keys" | ""          |
      | 3881    | "input"    | "t"        | "templates" | "single" | "path" | "f"    | "keys" | "variables" |
      | 3882    | "input"    | "t"        | "templates" | "single" | "path" | "f"    | "keys" | "x"         |
      | 3886    | "input"    | "t"        | "templates" | "single" | "path" | "file" | "keys" | ""          |
      | 3887    | "input"    | "t"        | "templates" | "single" | "path" | "file" | "keys" | "variables" |
      | 3888    | "input"    | "t"        | "templates" | "single" | "path" | "file" | "keys" | "x"         |
      | 3970    | "input"    | "template" | ""          | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 3971    | "input"    | "template" | ""          | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 3972    | "input"    | "template" | ""          | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 3976    | "input"    | "template" | ""          | "multi"  | "p"    | "file" | "keys" | ""          |
      | 3977    | "input"    | "template" | ""          | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 3978    | "input"    | "template" | ""          | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 3988    | "input"    | "template" | ""          | "multi"  | "path" | "f"    | "keys" | ""          |
      | 3989    | "input"    | "template" | ""          | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 3990    | "input"    | "template" | ""          | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 3994    | "input"    | "template" | ""          | "multi"  | "path" | "file" | "keys" | ""          |
      | 3995    | "input"    | "template" | ""          | "multi"  | "path" | "file" | "keys" | "variables" |
      | 3996    | "input"    | "template" | ""          | "multi"  | "path" | "file" | "keys" | "x"         |
      | 4024    | "input"    | "template" | ""          | "single" | "p"    | "f"    | "keys" | ""          |
      | 4025    | "input"    | "template" | ""          | "single" | "p"    | "f"    | "keys" | "variables" |
      | 4026    | "input"    | "template" | ""          | "single" | "p"    | "f"    | "keys" | "x"         |
      | 4030    | "input"    | "template" | ""          | "single" | "p"    | "file" | "keys" | ""          |
      | 4031    | "input"    | "template" | ""          | "single" | "p"    | "file" | "keys" | "variables" |
      | 4032    | "input"    | "template" | ""          | "single" | "p"    | "file" | "keys" | "x"         |
      | 4042    | "input"    | "template" | ""          | "single" | "path" | "f"    | "keys" | ""          |
      | 4043    | "input"    | "template" | ""          | "single" | "path" | "f"    | "keys" | "variables" |
      | 4044    | "input"    | "template" | ""          | "single" | "path" | "f"    | "keys" | "x"         |
      | 4048    | "input"    | "template" | ""          | "single" | "path" | "file" | "keys" | ""          |
      | 4049    | "input"    | "template" | ""          | "single" | "path" | "file" | "keys" | "variables" |
      | 4050    | "input"    | "template" | ""          | "single" | "path" | "file" | "keys" | "x"         |
      | 4132    | "input"    | "template" | "l"         | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 4133    | "input"    | "template" | "l"         | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 4134    | "input"    | "template" | "l"         | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 4138    | "input"    | "template" | "l"         | "multi"  | "p"    | "file" | "keys" | ""          |
      | 4139    | "input"    | "template" | "l"         | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 4140    | "input"    | "template" | "l"         | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 4150    | "input"    | "template" | "l"         | "multi"  | "path" | "f"    | "keys" | ""          |
      | 4151    | "input"    | "template" | "l"         | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 4152    | "input"    | "template" | "l"         | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 4156    | "input"    | "template" | "l"         | "multi"  | "path" | "file" | "keys" | ""          |
      | 4157    | "input"    | "template" | "l"         | "multi"  | "path" | "file" | "keys" | "variables" |
      | 4158    | "input"    | "template" | "l"         | "multi"  | "path" | "file" | "keys" | "x"         |
      | 4186    | "input"    | "template" | "l"         | "single" | "p"    | "f"    | "keys" | ""          |
      | 4187    | "input"    | "template" | "l"         | "single" | "p"    | "f"    | "keys" | "variables" |
      | 4188    | "input"    | "template" | "l"         | "single" | "p"    | "f"    | "keys" | "x"         |
      | 4192    | "input"    | "template" | "l"         | "single" | "p"    | "file" | "keys" | ""          |
      | 4193    | "input"    | "template" | "l"         | "single" | "p"    | "file" | "keys" | "variables" |
      | 4194    | "input"    | "template" | "l"         | "single" | "p"    | "file" | "keys" | "x"         |
      | 4204    | "input"    | "template" | "l"         | "single" | "path" | "f"    | "keys" | ""          |
      | 4205    | "input"    | "template" | "l"         | "single" | "path" | "f"    | "keys" | "variables" |
      | 4206    | "input"    | "template" | "l"         | "single" | "path" | "f"    | "keys" | "x"         |
      | 4210    | "input"    | "template" | "l"         | "single" | "path" | "file" | "keys" | ""          |
      | 4211    | "input"    | "template" | "l"         | "single" | "path" | "file" | "keys" | "variables" |
      | 4212    | "input"    | "template" | "l"         | "single" | "path" | "file" | "keys" | "x"         |
      | 4294    | "input"    | "template" | "templates" | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 4295    | "input"    | "template" | "templates" | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 4296    | "input"    | "template" | "templates" | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 4300    | "input"    | "template" | "templates" | "multi"  | "p"    | "file" | "keys" | ""          |
      | 4301    | "input"    | "template" | "templates" | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 4302    | "input"    | "template" | "templates" | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 4312    | "input"    | "template" | "templates" | "multi"  | "path" | "f"    | "keys" | ""          |
      | 4313    | "input"    | "template" | "templates" | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 4314    | "input"    | "template" | "templates" | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 4318    | "input"    | "template" | "templates" | "multi"  | "path" | "file" | "keys" | ""          |
      | 4319    | "input"    | "template" | "templates" | "multi"  | "path" | "file" | "keys" | "variables" |
      | 4320    | "input"    | "template" | "templates" | "multi"  | "path" | "file" | "keys" | "x"         |
      | 4348    | "input"    | "template" | "templates" | "single" | "p"    | "f"    | "keys" | ""          |
      | 4349    | "input"    | "template" | "templates" | "single" | "p"    | "f"    | "keys" | "variables" |
      | 4350    | "input"    | "template" | "templates" | "single" | "p"    | "f"    | "keys" | "x"         |
      | 4354    | "input"    | "template" | "templates" | "single" | "p"    | "file" | "keys" | ""          |
      | 4355    | "input"    | "template" | "templates" | "single" | "p"    | "file" | "keys" | "variables" |
      | 4356    | "input"    | "template" | "templates" | "single" | "p"    | "file" | "keys" | "x"         |
      | 4366    | "input"    | "template" | "templates" | "single" | "path" | "f"    | "keys" | ""          |
      | 4367    | "input"    | "template" | "templates" | "single" | "path" | "f"    | "keys" | "variables" |
      | 4368    | "input"    | "template" | "templates" | "single" | "path" | "f"    | "keys" | "x"         |
      | 4372    | "input"    | "template" | "templates" | "single" | "path" | "file" | "keys" | ""          |
      | 4373    | "input"    | "template" | "templates" | "single" | "path" | "file" | "keys" | "variables" |
      | 4374    | "input"    | "template" | "templates" | "single" | "path" | "file" | "keys" | "x"         |

  # The user will be able to transform values to upper first.
  @upperFirstValue
  Scenario Outline: Value
    Given upperFirstValue.<pUnique> the input <pInputString> is passed into Cimerant
    Then upperFirstValue.<pUnique> Cimerant outputs <pOutputString>

    Examples:
      | pUnique | pInputString      | pOutputString     |
      | 1       | null              | ""                |
      | 2       | ""                | ""                |
      | 3       | "a test string"   | "A test string"   |
      | 4       | "a Test String"   | "A Test String"   |
      | 5       | "A test string"   | "A test string"   |
      | 6       | "A Test String"   | "A Test String"   |
      | 7       | "A TEST STRING"   | "A TEST STRING"   |
      | 8       | "a_test_string"   | "A_test_string"   |
      | 9       | "a_Test_String"   | "A_Test_String"   |
      | 10      | "A_test_string"   | "A_test_string"   |
      | 11      | "A_Test_String"   | "A_Test_String"   |
      | 12      | "A_TEST_STRING"   | "A_TEST_STRING"   |
      | 13      | "a-test-string"   | "A-test-string"   |
      | 14      | "a-Test-String"   | "A-Test-String"   |
      | 15      | "A-test-string"   | "A-test-string"   |
      | 16      | "A-Test-String"   | "A-Test-String"   |
      | 17      | "A-TEST-STRING"   | "A-TEST-STRING"   |
      | 18      | "a.test.string"   | "A.test.string"   |
      | 19      | "a.Test.String"   | "A.Test.String"   |
      | 20      | "A.test.string"   | "A.test.string"   |
      | 21      | "A.Test.String"   | "A.Test.String"   |
      | 22      | "A.TEST.STRING"   | "A.TEST.STRING"   |
      | 23      | "a_test_string"   | "A_test_string"   |
      | 24      | "a_Test_String"   | "A_Test_String"   |
      | 25      | "A_test_string"   | "A_test_string"   |
      | 26      | "A_Test_String"   | "A_Test_String"   |
      | 27      | "A_TEST_STRING"   | "A_TEST_STRING"   |
      | 28      | "a/test/string"   | "A/test/string"   |
      | 29      | "a/Test/String"   | "A/Test/String"   |
      | 30      | "A/test/string"   | "A/test/string"   |
      | 31      | "A/Test/String"   | "A/Test/String"   |
      | 32      | "A/TEST/STRING"   | "A/TEST/STRING"   |
      | 33      | "a\\test\\string" | "A\\test\\string" |
      | 34      | "a\\Test\\String" | "A\\Test\\String" |
      | 35      | "A\\test\\string" | "A\\test\\string" |
      | 36      | "A\\Test\\String" | "A\\Test\\String" |
      | 37      | "A\\TEST\\STRING" | "A\\TEST\\STRING" |
      | 38      | "a$test$string"   | "A$test$string"   |
      | 39      | "a$Test$String"   | "A$Test$String"   |
      | 40      | "A$test$string"   | "A$test$string"   |
      | 41      | "A$Test$String"   | "A$Test$String"   |
      | 42      | "A$TEST$STRING"   | "A$TEST$STRING"   |
      | 43      | "aTestString"     | "ATestString"     |
      | 44      | "ATestString"     | "ATestString"     |
      | 45      | "ateststring"     | "Ateststring"     |
      | 46      | "Ateststring"     | "Ateststring"     |
      | 47      | "ATESTSTRING"     | "ATESTSTRING"     |
