Feature: is required

  @err0006
  Scenario Outline: err0006
    Given err0006.<pUnique> input file <pInputFile>
    * err0006.<pUnique> template <pTemplate>
    * err0006.<pUnique> templates <pTemplates>
    * err0006.<pUnique> single multi value <pSinti>
    * err0006.<pUnique> path <pPath>
    * err0006.<pUnique> file <pFile>
    * err0006.<pUnique> var <pVar>
    * err0006.<pUnique> vars <pVars>
    When err0006.<pUnique> the values are passed into Cimerant
    Then err0006.<pUnique> error is thrown

    Examples:
      | pUnique | pInputFile | pTemplate | pTemplates | pSinti   | pPath  | pFile  | pVar   | pVars       |
      | 1459    | "i"        | ""        | ""         | ""       | ""     | ""     | ""     | ""          |
      | 1460    | "i"        | ""        | ""         | ""       | ""     | ""     | ""     | "variables" |
      | 1461    | "i"        | ""        | ""         | ""       | ""     | ""     | ""     | "x"         |
      | 1462    | "i"        | ""        | ""         | ""       | ""     | ""     | "keys" | ""          |
      | 1463    | "i"        | ""        | ""         | ""       | ""     | ""     | "keys" | "variables" |
      | 1464    | "i"        | ""        | ""         | ""       | ""     | ""     | "keys" | "x"         |
      | 1465    | "i"        | ""        | ""         | ""       | ""     | "f"    | ""     | ""          |
      | 1466    | "i"        | ""        | ""         | ""       | ""     | "f"    | ""     | "variables" |
      | 1467    | "i"        | ""        | ""         | ""       | ""     | "f"    | ""     | "x"         |
      | 1468    | "i"        | ""        | ""         | ""       | ""     | "f"    | "keys" | ""          |
      | 1469    | "i"        | ""        | ""         | ""       | ""     | "f"    | "keys" | "variables" |
      | 1470    | "i"        | ""        | ""         | ""       | ""     | "f"    | "keys" | "x"         |
      | 1471    | "i"        | ""        | ""         | ""       | ""     | "file" | ""     | ""          |
      | 1472    | "i"        | ""        | ""         | ""       | ""     | "file" | ""     | "variables" |
      | 1473    | "i"        | ""        | ""         | ""       | ""     | "file" | ""     | "x"         |
      | 1474    | "i"        | ""        | ""         | ""       | ""     | "file" | "keys" | ""          |
      | 1475    | "i"        | ""        | ""         | ""       | ""     | "file" | "keys" | "variables" |
      | 1476    | "i"        | ""        | ""         | ""       | ""     | "file" | "keys" | "x"         |
      | 1477    | "i"        | ""        | ""         | ""       | "p"    | ""     | ""     | ""          |
      | 1478    | "i"        | ""        | ""         | ""       | "p"    | ""     | ""     | "variables" |
      | 1479    | "i"        | ""        | ""         | ""       | "p"    | ""     | ""     | "x"         |
      | 1480    | "i"        | ""        | ""         | ""       | "p"    | ""     | "keys" | ""          |
      | 1481    | "i"        | ""        | ""         | ""       | "p"    | ""     | "keys" | "variables" |
      | 1482    | "i"        | ""        | ""         | ""       | "p"    | ""     | "keys" | "x"         |
      | 1483    | "i"        | ""        | ""         | ""       | "p"    | "f"    | ""     | ""          |
      | 1484    | "i"        | ""        | ""         | ""       | "p"    | "f"    | ""     | "variables" |
      | 1485    | "i"        | ""        | ""         | ""       | "p"    | "f"    | ""     | "x"         |
      | 1486    | "i"        | ""        | ""         | ""       | "p"    | "f"    | "keys" | ""          |
      | 1487    | "i"        | ""        | ""         | ""       | "p"    | "f"    | "keys" | "variables" |
      | 1488    | "i"        | ""        | ""         | ""       | "p"    | "f"    | "keys" | "x"         |
      | 1489    | "i"        | ""        | ""         | ""       | "p"    | "file" | ""     | ""          |
      | 1490    | "i"        | ""        | ""         | ""       | "p"    | "file" | ""     | "variables" |
      | 1491    | "i"        | ""        | ""         | ""       | "p"    | "file" | ""     | "x"         |
      | 1492    | "i"        | ""        | ""         | ""       | "p"    | "file" | "keys" | ""          |
      | 1493    | "i"        | ""        | ""         | ""       | "p"    | "file" | "keys" | "variables" |
      | 1494    | "i"        | ""        | ""         | ""       | "p"    | "file" | "keys" | "x"         |
      | 1495    | "i"        | ""        | ""         | ""       | "path" | ""     | ""     | ""          |
      | 1496    | "i"        | ""        | ""         | ""       | "path" | ""     | ""     | "variables" |
      | 1497    | "i"        | ""        | ""         | ""       | "path" | ""     | ""     | "x"         |
      | 1498    | "i"        | ""        | ""         | ""       | "path" | ""     | "keys" | ""          |
      | 1499    | "i"        | ""        | ""         | ""       | "path" | ""     | "keys" | "variables" |
      | 1500    | "i"        | ""        | ""         | ""       | "path" | ""     | "keys" | "x"         |
      | 1501    | "i"        | ""        | ""         | ""       | "path" | "f"    | ""     | ""          |
      | 1502    | "i"        | ""        | ""         | ""       | "path" | "f"    | ""     | "variables" |
      | 1503    | "i"        | ""        | ""         | ""       | "path" | "f"    | ""     | "x"         |
      | 1504    | "i"        | ""        | ""         | ""       | "path" | "f"    | "keys" | ""          |
      | 1505    | "i"        | ""        | ""         | ""       | "path" | "f"    | "keys" | "variables" |
      | 1506    | "i"        | ""        | ""         | ""       | "path" | "f"    | "keys" | "x"         |
      | 1507    | "i"        | ""        | ""         | ""       | "path" | "file" | ""     | ""          |
      | 1508    | "i"        | ""        | ""         | ""       | "path" | "file" | ""     | "variables" |
      | 1509    | "i"        | ""        | ""         | ""       | "path" | "file" | ""     | "x"         |
      | 1510    | "i"        | ""        | ""         | ""       | "path" | "file" | "keys" | ""          |
      | 1511    | "i"        | ""        | ""         | ""       | "path" | "file" | "keys" | "variables" |
      | 1512    | "i"        | ""        | ""         | ""       | "path" | "file" | "keys" | "x"         |
      | 1513    | "i"        | ""        | ""         | "multi"  | ""     | ""     | ""     | ""          |
      | 1514    | "i"        | ""        | ""         | "multi"  | ""     | ""     | ""     | "variables" |
      | 1515    | "i"        | ""        | ""         | "multi"  | ""     | ""     | ""     | "x"         |
      | 1516    | "i"        | ""        | ""         | "multi"  | ""     | ""     | "keys" | ""          |
      | 1517    | "i"        | ""        | ""         | "multi"  | ""     | ""     | "keys" | "variables" |
      | 1518    | "i"        | ""        | ""         | "multi"  | ""     | ""     | "keys" | "x"         |
      | 1519    | "i"        | ""        | ""         | "multi"  | ""     | "f"    | ""     | ""          |
      | 1520    | "i"        | ""        | ""         | "multi"  | ""     | "f"    | ""     | "variables" |
      | 1521    | "i"        | ""        | ""         | "multi"  | ""     | "f"    | ""     | "x"         |
      | 1522    | "i"        | ""        | ""         | "multi"  | ""     | "f"    | "keys" | ""          |
      | 1523    | "i"        | ""        | ""         | "multi"  | ""     | "f"    | "keys" | "variables" |
      | 1524    | "i"        | ""        | ""         | "multi"  | ""     | "f"    | "keys" | "x"         |
      | 1525    | "i"        | ""        | ""         | "multi"  | ""     | "file" | ""     | ""          |
      | 1526    | "i"        | ""        | ""         | "multi"  | ""     | "file" | ""     | "variables" |
      | 1527    | "i"        | ""        | ""         | "multi"  | ""     | "file" | ""     | "x"         |
      | 1528    | "i"        | ""        | ""         | "multi"  | ""     | "file" | "keys" | ""          |
      | 1529    | "i"        | ""        | ""         | "multi"  | ""     | "file" | "keys" | "variables" |
      | 1530    | "i"        | ""        | ""         | "multi"  | ""     | "file" | "keys" | "x"         |
      | 1531    | "i"        | ""        | ""         | "multi"  | "p"    | ""     | ""     | ""          |
      | 1532    | "i"        | ""        | ""         | "multi"  | "p"    | ""     | ""     | "variables" |
      | 1533    | "i"        | ""        | ""         | "multi"  | "p"    | ""     | ""     | "x"         |
      | 1534    | "i"        | ""        | ""         | "multi"  | "p"    | ""     | "keys" | ""          |
      | 1535    | "i"        | ""        | ""         | "multi"  | "p"    | ""     | "keys" | "variables" |
      | 1536    | "i"        | ""        | ""         | "multi"  | "p"    | ""     | "keys" | "x"         |
      | 1537    | "i"        | ""        | ""         | "multi"  | "p"    | "f"    | ""     | ""          |
      | 1538    | "i"        | ""        | ""         | "multi"  | "p"    | "f"    | ""     | "variables" |
      | 1539    | "i"        | ""        | ""         | "multi"  | "p"    | "f"    | ""     | "x"         |
      | 1540    | "i"        | ""        | ""         | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 1541    | "i"        | ""        | ""         | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 1542    | "i"        | ""        | ""         | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 1543    | "i"        | ""        | ""         | "multi"  | "p"    | "file" | ""     | ""          |
      | 1544    | "i"        | ""        | ""         | "multi"  | "p"    | "file" | ""     | "variables" |
      | 1545    | "i"        | ""        | ""         | "multi"  | "p"    | "file" | ""     | "x"         |
      | 1546    | "i"        | ""        | ""         | "multi"  | "p"    | "file" | "keys" | ""          |
      | 1547    | "i"        | ""        | ""         | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 1548    | "i"        | ""        | ""         | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 1549    | "i"        | ""        | ""         | "multi"  | "path" | ""     | ""     | ""          |
      | 1550    | "i"        | ""        | ""         | "multi"  | "path" | ""     | ""     | "variables" |
      | 1551    | "i"        | ""        | ""         | "multi"  | "path" | ""     | ""     | "x"         |
      | 1552    | "i"        | ""        | ""         | "multi"  | "path" | ""     | "keys" | ""          |
      | 1553    | "i"        | ""        | ""         | "multi"  | "path" | ""     | "keys" | "variables" |
      | 1554    | "i"        | ""        | ""         | "multi"  | "path" | ""     | "keys" | "x"         |
      | 1555    | "i"        | ""        | ""         | "multi"  | "path" | "f"    | ""     | ""          |
      | 1556    | "i"        | ""        | ""         | "multi"  | "path" | "f"    | ""     | "variables" |
      | 1557    | "i"        | ""        | ""         | "multi"  | "path" | "f"    | ""     | "x"         |
      | 1558    | "i"        | ""        | ""         | "multi"  | "path" | "f"    | "keys" | ""          |
      | 1559    | "i"        | ""        | ""         | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 1560    | "i"        | ""        | ""         | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 1561    | "i"        | ""        | ""         | "multi"  | "path" | "file" | ""     | ""          |
      | 1562    | "i"        | ""        | ""         | "multi"  | "path" | "file" | ""     | "variables" |
      | 1563    | "i"        | ""        | ""         | "multi"  | "path" | "file" | ""     | "x"         |
      | 1564    | "i"        | ""        | ""         | "multi"  | "path" | "file" | "keys" | ""          |
      | 1565    | "i"        | ""        | ""         | "multi"  | "path" | "file" | "keys" | "variables" |
      | 1566    | "i"        | ""        | ""         | "multi"  | "path" | "file" | "keys" | "x"         |
      | 1567    | "i"        | ""        | ""         | "single" | ""     | ""     | ""     | ""          |
      | 1568    | "i"        | ""        | ""         | "single" | ""     | ""     | ""     | "variables" |
      | 1569    | "i"        | ""        | ""         | "single" | ""     | ""     | ""     | "x"         |
      | 1570    | "i"        | ""        | ""         | "single" | ""     | ""     | "keys" | ""          |
      | 1571    | "i"        | ""        | ""         | "single" | ""     | ""     | "keys" | "variables" |
      | 1572    | "i"        | ""        | ""         | "single" | ""     | ""     | "keys" | "x"         |
      | 1573    | "i"        | ""        | ""         | "single" | ""     | "f"    | ""     | ""          |
      | 1574    | "i"        | ""        | ""         | "single" | ""     | "f"    | ""     | "variables" |
      | 1575    | "i"        | ""        | ""         | "single" | ""     | "f"    | ""     | "x"         |
      | 1576    | "i"        | ""        | ""         | "single" | ""     | "f"    | "keys" | ""          |
      | 1577    | "i"        | ""        | ""         | "single" | ""     | "f"    | "keys" | "variables" |
      | 1578    | "i"        | ""        | ""         | "single" | ""     | "f"    | "keys" | "x"         |
      | 1579    | "i"        | ""        | ""         | "single" | ""     | "file" | ""     | ""          |
      | 1580    | "i"        | ""        | ""         | "single" | ""     | "file" | ""     | "variables" |
      | 1581    | "i"        | ""        | ""         | "single" | ""     | "file" | ""     | "x"         |
      | 1582    | "i"        | ""        | ""         | "single" | ""     | "file" | "keys" | ""          |
      | 1583    | "i"        | ""        | ""         | "single" | ""     | "file" | "keys" | "variables" |
      | 1584    | "i"        | ""        | ""         | "single" | ""     | "file" | "keys" | "x"         |
      | 1585    | "i"        | ""        | ""         | "single" | "p"    | ""     | ""     | ""          |
      | 1586    | "i"        | ""        | ""         | "single" | "p"    | ""     | ""     | "variables" |
      | 1587    | "i"        | ""        | ""         | "single" | "p"    | ""     | ""     | "x"         |
      | 1588    | "i"        | ""        | ""         | "single" | "p"    | ""     | "keys" | ""          |
      | 1589    | "i"        | ""        | ""         | "single" | "p"    | ""     | "keys" | "variables" |
      | 1590    | "i"        | ""        | ""         | "single" | "p"    | ""     | "keys" | "x"         |
      | 1591    | "i"        | ""        | ""         | "single" | "p"    | "f"    | ""     | ""          |
      | 1592    | "i"        | ""        | ""         | "single" | "p"    | "f"    | ""     | "variables" |
      | 1593    | "i"        | ""        | ""         | "single" | "p"    | "f"    | ""     | "x"         |
      | 1594    | "i"        | ""        | ""         | "single" | "p"    | "f"    | "keys" | ""          |
      | 1595    | "i"        | ""        | ""         | "single" | "p"    | "f"    | "keys" | "variables" |
      | 1596    | "i"        | ""        | ""         | "single" | "p"    | "f"    | "keys" | "x"         |
      | 1597    | "i"        | ""        | ""         | "single" | "p"    | "file" | ""     | ""          |
      | 1598    | "i"        | ""        | ""         | "single" | "p"    | "file" | ""     | "variables" |
      | 1599    | "i"        | ""        | ""         | "single" | "p"    | "file" | ""     | "x"         |
      | 1600    | "i"        | ""        | ""         | "single" | "p"    | "file" | "keys" | ""          |
      | 1601    | "i"        | ""        | ""         | "single" | "p"    | "file" | "keys" | "variables" |
      | 1602    | "i"        | ""        | ""         | "single" | "p"    | "file" | "keys" | "x"         |
      | 1603    | "i"        | ""        | ""         | "single" | "path" | ""     | ""     | ""          |
      | 1604    | "i"        | ""        | ""         | "single" | "path" | ""     | ""     | "variables" |
      | 1605    | "i"        | ""        | ""         | "single" | "path" | ""     | ""     | "x"         |
      | 1606    | "i"        | ""        | ""         | "single" | "path" | ""     | "keys" | ""          |
      | 1607    | "i"        | ""        | ""         | "single" | "path" | ""     | "keys" | "variables" |
      | 1608    | "i"        | ""        | ""         | "single" | "path" | ""     | "keys" | "x"         |
      | 1609    | "i"        | ""        | ""         | "single" | "path" | "f"    | ""     | ""          |
      | 1610    | "i"        | ""        | ""         | "single" | "path" | "f"    | ""     | "variables" |
      | 1611    | "i"        | ""        | ""         | "single" | "path" | "f"    | ""     | "x"         |
      | 1612    | "i"        | ""        | ""         | "single" | "path" | "f"    | "keys" | ""          |
      | 1613    | "i"        | ""        | ""         | "single" | "path" | "f"    | "keys" | "variables" |
      | 1614    | "i"        | ""        | ""         | "single" | "path" | "f"    | "keys" | "x"         |
      | 1615    | "i"        | ""        | ""         | "single" | "path" | "file" | ""     | ""          |
      | 1616    | "i"        | ""        | ""         | "single" | "path" | "file" | ""     | "variables" |
      | 1617    | "i"        | ""        | ""         | "single" | "path" | "file" | ""     | "x"         |
      | 1618    | "i"        | ""        | ""         | "single" | "path" | "file" | "keys" | ""          |
      | 1619    | "i"        | ""        | ""         | "single" | "path" | "file" | "keys" | "variables" |
      | 1620    | "i"        | ""        | ""         | "single" | "path" | "file" | "keys" | "x"         |
      | 2917    | "input"    | ""        | ""         | ""       | ""     | ""     | ""     | ""          |
      | 2918    | "input"    | ""        | ""         | ""       | ""     | ""     | ""     | "variables" |
      | 2919    | "input"    | ""        | ""         | ""       | ""     | ""     | ""     | "x"         |
      | 2920    | "input"    | ""        | ""         | ""       | ""     | ""     | "keys" | ""          |
      | 2921    | "input"    | ""        | ""         | ""       | ""     | ""     | "keys" | "variables" |
      | 2922    | "input"    | ""        | ""         | ""       | ""     | ""     | "keys" | "x"         |
      | 2923    | "input"    | ""        | ""         | ""       | ""     | "f"    | ""     | ""          |
      | 2924    | "input"    | ""        | ""         | ""       | ""     | "f"    | ""     | "variables" |
      | 2925    | "input"    | ""        | ""         | ""       | ""     | "f"    | ""     | "x"         |
      | 2926    | "input"    | ""        | ""         | ""       | ""     | "f"    | "keys" | ""          |
      | 2927    | "input"    | ""        | ""         | ""       | ""     | "f"    | "keys" | "variables" |
      | 2928    | "input"    | ""        | ""         | ""       | ""     | "f"    | "keys" | "x"         |
      | 2929    | "input"    | ""        | ""         | ""       | ""     | "file" | ""     | ""          |
      | 2930    | "input"    | ""        | ""         | ""       | ""     | "file" | ""     | "variables" |
      | 2931    | "input"    | ""        | ""         | ""       | ""     | "file" | ""     | "x"         |
      | 2932    | "input"    | ""        | ""         | ""       | ""     | "file" | "keys" | ""          |
      | 2933    | "input"    | ""        | ""         | ""       | ""     | "file" | "keys" | "variables" |
      | 2934    | "input"    | ""        | ""         | ""       | ""     | "file" | "keys" | "x"         |
      | 2935    | "input"    | ""        | ""         | ""       | "p"    | ""     | ""     | ""          |
      | 2936    | "input"    | ""        | ""         | ""       | "p"    | ""     | ""     | "variables" |
      | 2937    | "input"    | ""        | ""         | ""       | "p"    | ""     | ""     | "x"         |
      | 2938    | "input"    | ""        | ""         | ""       | "p"    | ""     | "keys" | ""          |
      | 2939    | "input"    | ""        | ""         | ""       | "p"    | ""     | "keys" | "variables" |
      | 2940    | "input"    | ""        | ""         | ""       | "p"    | ""     | "keys" | "x"         |
      | 2941    | "input"    | ""        | ""         | ""       | "p"    | "f"    | ""     | ""          |
      | 2942    | "input"    | ""        | ""         | ""       | "p"    | "f"    | ""     | "variables" |
      | 2943    | "input"    | ""        | ""         | ""       | "p"    | "f"    | ""     | "x"         |
      | 2944    | "input"    | ""        | ""         | ""       | "p"    | "f"    | "keys" | ""          |
      | 2945    | "input"    | ""        | ""         | ""       | "p"    | "f"    | "keys" | "variables" |
      | 2946    | "input"    | ""        | ""         | ""       | "p"    | "f"    | "keys" | "x"         |
      | 2947    | "input"    | ""        | ""         | ""       | "p"    | "file" | ""     | ""          |
      | 2948    | "input"    | ""        | ""         | ""       | "p"    | "file" | ""     | "variables" |
      | 2949    | "input"    | ""        | ""         | ""       | "p"    | "file" | ""     | "x"         |
      | 2950    | "input"    | ""        | ""         | ""       | "p"    | "file" | "keys" | ""          |
      | 2951    | "input"    | ""        | ""         | ""       | "p"    | "file" | "keys" | "variables" |
      | 2952    | "input"    | ""        | ""         | ""       | "p"    | "file" | "keys" | "x"         |
      | 2953    | "input"    | ""        | ""         | ""       | "path" | ""     | ""     | ""          |
      | 2954    | "input"    | ""        | ""         | ""       | "path" | ""     | ""     | "variables" |
      | 2955    | "input"    | ""        | ""         | ""       | "path" | ""     | ""     | "x"         |
      | 2956    | "input"    | ""        | ""         | ""       | "path" | ""     | "keys" | ""          |
      | 2957    | "input"    | ""        | ""         | ""       | "path" | ""     | "keys" | "variables" |
      | 2958    | "input"    | ""        | ""         | ""       | "path" | ""     | "keys" | "x"         |
      | 2959    | "input"    | ""        | ""         | ""       | "path" | "f"    | ""     | ""          |
      | 2960    | "input"    | ""        | ""         | ""       | "path" | "f"    | ""     | "variables" |
      | 2961    | "input"    | ""        | ""         | ""       | "path" | "f"    | ""     | "x"         |
      | 2962    | "input"    | ""        | ""         | ""       | "path" | "f"    | "keys" | ""          |
      | 2963    | "input"    | ""        | ""         | ""       | "path" | "f"    | "keys" | "variables" |
      | 2964    | "input"    | ""        | ""         | ""       | "path" | "f"    | "keys" | "x"         |
      | 2965    | "input"    | ""        | ""         | ""       | "path" | "file" | ""     | ""          |
      | 2966    | "input"    | ""        | ""         | ""       | "path" | "file" | ""     | "variables" |
      | 2967    | "input"    | ""        | ""         | ""       | "path" | "file" | ""     | "x"         |
      | 2968    | "input"    | ""        | ""         | ""       | "path" | "file" | "keys" | ""          |
      | 2969    | "input"    | ""        | ""         | ""       | "path" | "file" | "keys" | "variables" |
      | 2970    | "input"    | ""        | ""         | ""       | "path" | "file" | "keys" | "x"         |
      | 2971    | "input"    | ""        | ""         | "multi"  | ""     | ""     | ""     | ""          |
      | 2972    | "input"    | ""        | ""         | "multi"  | ""     | ""     | ""     | "variables" |
      | 2973    | "input"    | ""        | ""         | "multi"  | ""     | ""     | ""     | "x"         |
      | 2974    | "input"    | ""        | ""         | "multi"  | ""     | ""     | "keys" | ""          |
      | 2975    | "input"    | ""        | ""         | "multi"  | ""     | ""     | "keys" | "variables" |
      | 2976    | "input"    | ""        | ""         | "multi"  | ""     | ""     | "keys" | "x"         |
      | 2977    | "input"    | ""        | ""         | "multi"  | ""     | "f"    | ""     | ""          |
      | 2978    | "input"    | ""        | ""         | "multi"  | ""     | "f"    | ""     | "variables" |
      | 2979    | "input"    | ""        | ""         | "multi"  | ""     | "f"    | ""     | "x"         |
      | 2980    | "input"    | ""        | ""         | "multi"  | ""     | "f"    | "keys" | ""          |
      | 2981    | "input"    | ""        | ""         | "multi"  | ""     | "f"    | "keys" | "variables" |
      | 2982    | "input"    | ""        | ""         | "multi"  | ""     | "f"    | "keys" | "x"         |
      | 2983    | "input"    | ""        | ""         | "multi"  | ""     | "file" | ""     | ""          |
      | 2984    | "input"    | ""        | ""         | "multi"  | ""     | "file" | ""     | "variables" |
      | 2985    | "input"    | ""        | ""         | "multi"  | ""     | "file" | ""     | "x"         |
      | 2986    | "input"    | ""        | ""         | "multi"  | ""     | "file" | "keys" | ""          |
      | 2987    | "input"    | ""        | ""         | "multi"  | ""     | "file" | "keys" | "variables" |
      | 2988    | "input"    | ""        | ""         | "multi"  | ""     | "file" | "keys" | "x"         |
      | 2989    | "input"    | ""        | ""         | "multi"  | "p"    | ""     | ""     | ""          |
      | 2990    | "input"    | ""        | ""         | "multi"  | "p"    | ""     | ""     | "variables" |
      | 2991    | "input"    | ""        | ""         | "multi"  | "p"    | ""     | ""     | "x"         |
      | 2992    | "input"    | ""        | ""         | "multi"  | "p"    | ""     | "keys" | ""          |
      | 2993    | "input"    | ""        | ""         | "multi"  | "p"    | ""     | "keys" | "variables" |
      | 2994    | "input"    | ""        | ""         | "multi"  | "p"    | ""     | "keys" | "x"         |
      | 2995    | "input"    | ""        | ""         | "multi"  | "p"    | "f"    | ""     | ""          |
      | 2996    | "input"    | ""        | ""         | "multi"  | "p"    | "f"    | ""     | "variables" |
      | 2997    | "input"    | ""        | ""         | "multi"  | "p"    | "f"    | ""     | "x"         |
      | 2998    | "input"    | ""        | ""         | "multi"  | "p"    | "f"    | "keys" | ""          |
      | 2999    | "input"    | ""        | ""         | "multi"  | "p"    | "f"    | "keys" | "variables" |
      | 3000    | "input"    | ""        | ""         | "multi"  | "p"    | "f"    | "keys" | "x"         |
      | 3001    | "input"    | ""        | ""         | "multi"  | "p"    | "file" | ""     | ""          |
      | 3002    | "input"    | ""        | ""         | "multi"  | "p"    | "file" | ""     | "variables" |
      | 3003    | "input"    | ""        | ""         | "multi"  | "p"    | "file" | ""     | "x"         |
      | 3004    | "input"    | ""        | ""         | "multi"  | "p"    | "file" | "keys" | ""          |
      | 3005    | "input"    | ""        | ""         | "multi"  | "p"    | "file" | "keys" | "variables" |
      | 3006    | "input"    | ""        | ""         | "multi"  | "p"    | "file" | "keys" | "x"         |
      | 3007    | "input"    | ""        | ""         | "multi"  | "path" | ""     | ""     | ""          |
      | 3008    | "input"    | ""        | ""         | "multi"  | "path" | ""     | ""     | "variables" |
      | 3009    | "input"    | ""        | ""         | "multi"  | "path" | ""     | ""     | "x"         |
      | 3010    | "input"    | ""        | ""         | "multi"  | "path" | ""     | "keys" | ""          |
      | 3011    | "input"    | ""        | ""         | "multi"  | "path" | ""     | "keys" | "variables" |
      | 3012    | "input"    | ""        | ""         | "multi"  | "path" | ""     | "keys" | "x"         |
      | 3013    | "input"    | ""        | ""         | "multi"  | "path" | "f"    | ""     | ""          |
      | 3014    | "input"    | ""        | ""         | "multi"  | "path" | "f"    | ""     | "variables" |
      | 3015    | "input"    | ""        | ""         | "multi"  | "path" | "f"    | ""     | "x"         |
      | 3016    | "input"    | ""        | ""         | "multi"  | "path" | "f"    | "keys" | ""          |
      | 3017    | "input"    | ""        | ""         | "multi"  | "path" | "f"    | "keys" | "variables" |
      | 3018    | "input"    | ""        | ""         | "multi"  | "path" | "f"    | "keys" | "x"         |
      | 3019    | "input"    | ""        | ""         | "multi"  | "path" | "file" | ""     | ""          |
      | 3020    | "input"    | ""        | ""         | "multi"  | "path" | "file" | ""     | "variables" |
      | 3021    | "input"    | ""        | ""         | "multi"  | "path" | "file" | ""     | "x"         |
      | 3022    | "input"    | ""        | ""         | "multi"  | "path" | "file" | "keys" | ""          |
      | 3023    | "input"    | ""        | ""         | "multi"  | "path" | "file" | "keys" | "variables" |
      | 3024    | "input"    | ""        | ""         | "multi"  | "path" | "file" | "keys" | "x"         |
      | 3025    | "input"    | ""        | ""         | "single" | ""     | ""     | ""     | ""          |
      | 3026    | "input"    | ""        | ""         | "single" | ""     | ""     | ""     | "variables" |
      | 3027    | "input"    | ""        | ""         | "single" | ""     | ""     | ""     | "x"         |
      | 3028    | "input"    | ""        | ""         | "single" | ""     | ""     | "keys" | ""          |
      | 3029    | "input"    | ""        | ""         | "single" | ""     | ""     | "keys" | "variables" |
      | 3030    | "input"    | ""        | ""         | "single" | ""     | ""     | "keys" | "x"         |
      | 3031    | "input"    | ""        | ""         | "single" | ""     | "f"    | ""     | ""          |
      | 3032    | "input"    | ""        | ""         | "single" | ""     | "f"    | ""     | "variables" |
      | 3033    | "input"    | ""        | ""         | "single" | ""     | "f"    | ""     | "x"         |
      | 3034    | "input"    | ""        | ""         | "single" | ""     | "f"    | "keys" | ""          |
      | 3035    | "input"    | ""        | ""         | "single" | ""     | "f"    | "keys" | "variables" |
      | 3036    | "input"    | ""        | ""         | "single" | ""     | "f"    | "keys" | "x"         |
      | 3037    | "input"    | ""        | ""         | "single" | ""     | "file" | ""     | ""          |
      | 3038    | "input"    | ""        | ""         | "single" | ""     | "file" | ""     | "variables" |
      | 3039    | "input"    | ""        | ""         | "single" | ""     | "file" | ""     | "x"         |
      | 3040    | "input"    | ""        | ""         | "single" | ""     | "file" | "keys" | ""          |
      | 3041    | "input"    | ""        | ""         | "single" | ""     | "file" | "keys" | "variables" |
      | 3042    | "input"    | ""        | ""         | "single" | ""     | "file" | "keys" | "x"         |
      | 3043    | "input"    | ""        | ""         | "single" | "p"    | ""     | ""     | ""          |
      | 3044    | "input"    | ""        | ""         | "single" | "p"    | ""     | ""     | "variables" |
      | 3045    | "input"    | ""        | ""         | "single" | "p"    | ""     | ""     | "x"         |
      | 3046    | "input"    | ""        | ""         | "single" | "p"    | ""     | "keys" | ""          |
      | 3047    | "input"    | ""        | ""         | "single" | "p"    | ""     | "keys" | "variables" |
      | 3048    | "input"    | ""        | ""         | "single" | "p"    | ""     | "keys" | "x"         |
      | 3049    | "input"    | ""        | ""         | "single" | "p"    | "f"    | ""     | ""          |
      | 3050    | "input"    | ""        | ""         | "single" | "p"    | "f"    | ""     | "variables" |
      | 3051    | "input"    | ""        | ""         | "single" | "p"    | "f"    | ""     | "x"         |
      | 3052    | "input"    | ""        | ""         | "single" | "p"    | "f"    | "keys" | ""          |
      | 3053    | "input"    | ""        | ""         | "single" | "p"    | "f"    | "keys" | "variables" |
      | 3054    | "input"    | ""        | ""         | "single" | "p"    | "f"    | "keys" | "x"         |
      | 3055    | "input"    | ""        | ""         | "single" | "p"    | "file" | ""     | ""          |
      | 3056    | "input"    | ""        | ""         | "single" | "p"    | "file" | ""     | "variables" |
      | 3057    | "input"    | ""        | ""         | "single" | "p"    | "file" | ""     | "x"         |
      | 3058    | "input"    | ""        | ""         | "single" | "p"    | "file" | "keys" | ""          |
      | 3059    | "input"    | ""        | ""         | "single" | "p"    | "file" | "keys" | "variables" |
      | 3060    | "input"    | ""        | ""         | "single" | "p"    | "file" | "keys" | "x"         |
      | 3061    | "input"    | ""        | ""         | "single" | "path" | ""     | ""     | ""          |
      | 3062    | "input"    | ""        | ""         | "single" | "path" | ""     | ""     | "variables" |
      | 3063    | "input"    | ""        | ""         | "single" | "path" | ""     | ""     | "x"         |
      | 3064    | "input"    | ""        | ""         | "single" | "path" | ""     | "keys" | ""          |
      | 3065    | "input"    | ""        | ""         | "single" | "path" | ""     | "keys" | "variables" |
      | 3066    | "input"    | ""        | ""         | "single" | "path" | ""     | "keys" | "x"         |
      | 3067    | "input"    | ""        | ""         | "single" | "path" | "f"    | ""     | ""          |
      | 3068    | "input"    | ""        | ""         | "single" | "path" | "f"    | ""     | "variables" |
      | 3069    | "input"    | ""        | ""         | "single" | "path" | "f"    | ""     | "x"         |
      | 3070    | "input"    | ""        | ""         | "single" | "path" | "f"    | "keys" | ""          |
      | 3071    | "input"    | ""        | ""         | "single" | "path" | "f"    | "keys" | "variables" |
      | 3072    | "input"    | ""        | ""         | "single" | "path" | "f"    | "keys" | "x"         |
      | 3073    | "input"    | ""        | ""         | "single" | "path" | "file" | ""     | ""          |
      | 3074    | "input"    | ""        | ""         | "single" | "path" | "file" | ""     | "variables" |
      | 3075    | "input"    | ""        | ""         | "single" | "path" | "file" | ""     | "x"         |
      | 3076    | "input"    | ""        | ""         | "single" | "path" | "file" | "keys" | ""          |
      | 3077    | "input"    | ""        | ""         | "single" | "path" | "file" | "keys" | "variables" |
      | 3078    | "input"    | ""        | ""         | "single" | "path" | "file" | "keys" | "x"         |

  # Test when columns in the template file are blank
  @err0006Blank
  Scenario Outline: err0006Blank
    Given err0006.<pUnique> input file <pInputFile>
    * err0006.<pUnique> list of templates where some are blank
    When err0006.<pUnique> the values are passed into Cimerant
    Then err0006.<pUnique> error is thrown

    Examples:
      | pUnique | pInputFile |
      | 3079    | "input"    |

  # Test when columns in the template file are missing
  @err0006Missing
  Scenario Outline: err0006Missing
    Given err0006.<pUnique> input file <pInputFile>
    * err0006.<pUnique> list of templates where some are missing
    When err0006.<pUnique> the values are passed into Cimerant
    Then err0006.<pUnique> error is thrown

    Examples:
      | pUnique | pInputFile |
      | 3080    | "input"    |
