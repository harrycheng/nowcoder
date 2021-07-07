package com.hc.nowcoder;

import com.sun.org.apache.xalan.internal.xsltc.compiler.SourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MaximumRemovalsSolution {
    public static void main(String[] args) throws IOException {


//        String s = "abcacb", p = "ab";
//        int[] removable = {3, 1, 0};

//        String s = "abcbddddd", p = "abcd";
//        int[] removable = {3,2,1,4,5,6};

//
//        String s = "kakrxlbkhfxzfaxreojbdfbhdejobizzridqplnfgukolhcrzlrnqrdelbmfamrfcbddbdmpsqruiafigyhihfzmnzvrxvpwesduemdyvmqgeevlrwtcinxshgoltjfkdkpvwglptcfaxjdltkdyyemlvaayjhklayababxatsdciqvqkmlfgwlqmwewotdtyyaypqpxeewlqwgjecsehhjichgqhtqrkfyslflaohwgabltispnihkolilrwlpbugcrokhizxwbsseyczfnjbmoaszujgfqcwjabenflemzcliwmzlayceopgjuwnuatokeoetwyysrfcxncgrpcaibzrocakrospjstrwfydmghmfxeyqjaedgclgdyqbcphlawxwtyrgvezfsgpnbepythifafmigvkungojtgcbxwyrbhgytzcrgdlyuxktxkitbyqdfszetlvpnhdbjdixlmkjegkalhwndcqrygzmqgpyqglwelxzavojwcvpdgcquszwgmxykgzqtfvhhlyvwdlirbcbjkfgwcwwvjzkunfzypljuzpdtbxucdryeokuapkcsddvzyftehyhwvlhncovkyurdjlqumvfttrjcnlkvyfkmmwifcvaqrjmvudnogvfjynzelzuoizpacrcrlmkxewxdjrczgvxiusbfoaawqrrowcgfreqzqvbgzkubbwbpyjhaciffkhgqkxsvevqofgmmpzabqsynukahhxqcoagjxmukwapqweelthmndtmemdplydtpqgijoelktrapkqjgqtvnphnircizfemuvhxlzbbcoehnzhfbcqkbavujibgjocvftalxbtqgswogplcmtvkhscvdihqdngkzfhpgqvxmivcslbhfualzevzmbbquezqfhlcsvqzqurcsrboriawjeqpabmujjtxlmeilprpdtcrowngmktlzpmlyrthzilkkhpeddcanmdzxbvoxzohlhlwzjpttuygjmdjnlojqnhrivgttfymofmrcgllkiupvkljnueajftcpbybgxwfluccheiwinlxfrthgwhshdjbqqzzngkrbsicjqzgomotlpqfcpekoqnkiosozexwsuqvwucvepmvocgzspfhosomvzfwfeklbiizbfodyzljvljggldjzcyrkoefguanbglqheshhbobmvqwjlrccmmhohmjpaccrfcahzxwnvgfjwpxkpmzqznjfpuyazjxdabyqigxfqgetbxfnbmotnjsjjqbweujclgkzvanwdxaczujfvioyjgzarsjdkkchahczxuezetiqeytymosksupeeqpfuyqihggimkpbwdncfgktbujwnclrxcihrmaoxisyvneifmosvswqsnhmzigujjkfgmpxyxlhwuseilryiwjimexptgzdwxwjnxgtasoiwsjgndpdrcbnnvwhkhryzpxmxyenkioddjscosioxevdljocpuvyoozfkcjhsxbrycrjzmwgrhmuknwqieoyghunigsmbevklptqoyurdquoqenyunqdunxhgtxijnijweaybqbvfjmyworsjkfmqnjpwvxqzuyhtkswukqzcbdcfguxqjglwhrrvmjhplfdncqwgtdywcqinhxftmyzxswwactklldbeibewolwbgvenxjhrojwfgmyiemwcjyidgdxsmkacfwmvlpcorkvjjwayyvkjbneqbixnyurhjbiikwtescxcdiednphekhgkhwcjkdaexswoqkocpyavwieijpsmeeiygzvyaozfkboutomcsbzzfhwuhwmcgdvfbewgvdcxxbjxmedtygxdbukblbqoerbtpnrwcqfrviicfhrpddimyfwfetnlcnruhxuviacposbnghzyhglqfevgsvnboeimsolhauectenpzsrgzmkrvfqfxcwzbtqxnsqkaykxwddtdmhupnmqmwjxstbuzdwrexegbudxfeomhfoxtgxovufvqbbdetfvpwpbanqrntuzhkmatedxygfarkpkqenrcrcylyatmhgsopczuraxxxvtqwevzbgrpiiiwxpfjkqljchrjkzgxentsxpklrmwveefssjtrnwkhfbzmynrulcalllafovfwmuzpormuwnfidqiwmosjwcpxqrulwtqiypljoyqpuyoaymswofqocztbgaeeiujkpibrdgprhrbfzlaqtgtngsgkxejucwkquogjbwnilxhqdnxnhaqeqfmwsjrxsyutdovldnuqktjscqcwtwsxgaqemdmbsnnfpqmjukftgrcfgofydvuszopauhiqtqgnhtuqogeaoulhpusfmutqrdxmiqneuvdnkppuxgwrragdlislhuwcubhocnifnwydhlrwqdrzrnruagubxbzycmylciffintcacuywqzxlsghgghrsnrxfqrananhaiuyclqcucaedkzdkfdndqihltssxdpbvempenwzbvxsgkzinbrojmazuxycpdggygnotslhoozuhcxeclndlyyzljqtkujtyzklcicvhajoustfqmallivlkksszjefucvzmhueappprjpkrgmxxaytugrxgnbuxmkntaokqmsrxehhsmdjmvfjecsdzbanewffwgdlgpxkfrumksrtquhxekgkxtrwfpanxtexesrjprhmjvqtupuzvvhgyurdxbwvftenoxqoufovboywbjqktjckrdtrqntvjyphvnuxaeloejfcdgyjfljgmchrjhctoifputmqkjwdkxjhnljoofeiheuqsxoarteemgtirutmlpfxqpkeexnrjslkvmtvpykbehfvufrhivalalbocwyzjzpacffqosevribqphtiffzvdmhxezzbsclshvgknodrzdleglcxmtudxozacawyagywdxlzcsqwvqlbeebfbrztqoatsikawngonxoxquxjbqnivhzwovzbeyhrwtxaqynxyytlmjioqiupsfmbifduexvfxhninbmoohvpdcaklfvlvmnkwclnoozcrszboetoxidzzuqpxvwjxeikpdaoabjvqlrpoxshthkpuqkoa";
//        String p = "krxlbkfzxrjdbdbirqlolzrdelfbdbrifhhzrpsdmdmgelrwtxodkgfjtkdyahlabsdqkmlwlqeodyypwlqwshjihqqatipnklilrwokhxseczjbufqblelmleuaoktyysrfxnrbzrokopjswygejdgclagvfsbetifagkunogbwyrhytzryxkyqdfsevpnhdjilmkekadcqelxzaovggzhhlvwcbjgwwjnzyljuduyaksdvzyehwhnvkyurlttrcnlykmwiqrjmvfyloipcrclxdguoaqowcrqvzkubbaiffsqogmpzbynukowwemndtemltpqelkrkqvpzehlbncqjbotabtplcmtsddgkzgvicshulzevbezqvqzqrriwpbmuxleprdtrowktzyzedcndzboljtjmjjqnitfglupkjfyxfluceixthdjqqzngkrbsczoolcpkoqksoxuvuvmocgsfvzfkibyjvjgljrgungmlrchhmjcczngwzfyazayqigtftjqejcgkvawzuoyasdaxuezeiqypfiipbwbujrhiynimossjjxxhwueiyiwjmeptjntjndrcnkhyzpyenooixcpvozbcrwukiygnibvklptqounyudhgtieabfywofmjwxwkzcgqgwhrvmgtdnhxfmyzactwjrojmicvlporvjwykjbnqixnyutxcednhkcjdeswopaijezfbzzfhhwmcdgdxyxdbbbqtpnwqfrvcfhrpddmfwetvsbnghyhglqvsneimsolepgzrfqxwqxnkydmwjxudexxmfxxvfvqbbvwbrnmexyfarkncratouxxtwjqljcjxrveesjtnbzalafovwmzriiwmowlwtqiloyuyaymoqoceiukprgrlgukubwnxhdhefjrdovlnkcqwtsxqemdnfqmkgcfofydvuszouhittqoglhsutdxipadswucinwrwqrzrrcfcuwxlsghrnrxfraaiylqcaedkzdnitsxbvepewzvxskioxpggygtoucendzlqttlchajusmallszjuczmuappkrmxygrnntkqresfdbnfgdlrumtkgrwxrtuvvhrxvoqouvbjqtrrqntjyvuejgjljcjptknjooeiuxoaemitxqpybefuhlbvihfvdhbchvgrdlgcmtoaaawxlzqwvebtotiwgoxjnzbehrxxmjiupmbifevfxhoakfvmwcozszbtxdzzuqpvwjkabjqrposhpqkoa";
//        int[] removable = {1116, 2581, 2855, 2982, 884, 2704, 3112, 2352, 821, 2879, 2890, 801, 1234, 722, 136, 641, 2178, 2670, 1349, 1670, 3069, 116, 1752, 553, 127, 212, 1692, 768, 459, 1769, 1187, 1119, 307, 882, 2744, 2867, 703, 341, 3107, 382, 2411, 1400, 2672, 164, 3090, 1537, 241, 2186, 858, 1938, 2458, 1152, 666, 3097, 1788, 518, 2852, 3092, 2883, 758, 1891, 823, 1445, 1570, 947, 1369, 975, 1975, 2208, 1816, 1946, 1710, 514, 400, 2448, 372, 1671, 941, 631, 2001, 876, 291, 1049, 2336, 2469, 1402, 232, 1874, 2072, 1580, 1197, 2972, 36, 350, 912, 184, 1592, 1451, 125, 940, 1294, 3011, 1805, 1336, 1850, 2355, 1384, 388, 1668, 1180, 3027, 2236, 1200, 1487, 480, 2078, 1676, 2082, 1176, 1965, 781, 788, 2860, 2608, 2241, 2427, 699, 1023, 267, 443, 264, 333, 573, 2160, 1161, 1332, 1150, 201, 2124, 2163, 2274, 2873, 1350, 2394, 2690, 962, 2764, 2320, 1701, 1029, 1957, 922, 1705, 2926, 1843, 1707, 2244, 64, 1743, 2409, 1226, 757, 52, 1319, 2597, 1693, 238, 659, 1388, 713, 2490, 3023, 1072, 2468, 2882, 1943, 2590, 544, 427, 2671, 1978, 1401, 1663, 1631, 1052, 1987, 2109, 1011, 2292, 1700, 1189, 1162, 1093, 2541, 1066, 2452, 255, 2965, 271, 1649, 653, 492, 2382, 1353, 1579, 497, 1338, 3079, 1697, 2829, 446, 1682, 235, 2708, 2453, 702, 651, 2442, 1269, 1971, 229, 2238, 1043, 969, 2233, 608, 1804, 2562, 2112, 348, 1489, 1278, 1749, 869, 712, 2434, 2888, 2753, 3051, 727, 2974, 299, 632, 2993, 2288, 1185, 2588, 1680, 522, 716, 441, 440, 1077, 19, 2853, 1607, 2034, 2655, 2785, 2359, 2801, 1855, 1242, 506, 2187, 826, 1897, 3003, 3040, 2884, 2376, 342, 31, 1553, 1238, 1698, 2827, 1025, 577, 2207, 2629, 1125, 2907, 3056, 2642, 2203, 2961, 564, 807, 2374, 1885, 247, 1635, 2086, 392, 485, 746, 1586, 2216, 356, 537, 495, 496, 25, 1784, 889, 1847, 2626, 1937, 1223, 2761, 2400, 668, 2897, 2959, 1620, 2945, 397, 2043, 2177, 2804, 600, 1661, 1462, 1348, 173, 1503, 2422, 572, 2211, 1264, 2375, 2317, 60, 226, 1616, 809, 798, 224, 457, 2141, 1976, 580, 1244, 920, 755, 256, 847, 2225, 2510, 253, 926, 2088, 347, 2916, 2563, 1433, 2571, 1601, 1526, 1061, 2051, 2725, 2296, 2996, 1154, 2792, 1051, 1835, 115, 1780, 1627, 1814, 787, 633, 2998, 1418, 1949, 2807, 1622, 2431, 3094, 1284, 1972, 3064, 610, 816, 2117, 30, 1973, 1941, 998, 1313, 1085, 2265, 824, 2777, 750, 49, 393, 2904, 288, 2428, 831, 21, 2095, 972, 1305, 2251, 414, 1046, 2036, 1794, 1511, 2892, 163, 1766, 1719, 2536, 2209, 795, 728, 2120, 1, 1505, 2140, 413, 551, 2984, 2085, 2281, 2663, 2940, 370, 2253, 3010, 79, 228, 1901, 2770, 2683, 2856, 41, 893, 2108, 2131, 2516, 687, 575, 2158, 1476, 1675, 2003, 117, 2494, 1845, 2715, 3015, 2326, 994, 973, 185, 2210, 1191, 1391, 1500, 2081, 2705, 2179, 2111, 678, 2840, 1318, 1936, 1714, 649, 2837, 1599, 1054, 675, 2193, 2735, 305, 254, 683, 1225, 2682, 2929, 2540, 2087, 785, 2947, 2146, 2765, 1329, 1904, 2054, 1995, 1249, 2548, 139, 258, 468, 1925, 2651, 2167, 1352, 2556, 2990, 45, 2200, 2405, 2358, 565, 510, 2818, 103, 2196, 2901, 2605, 2821, 147, 327, 2986, 369, 1715, 2689, 1605, 2912, 2617, 2071, 2679, 1146, 2611, 2733, 275, 2261, 50, 2401, 1398, 1706, 881, 2385, 281, 10, 1142, 1603, 2243, 2239, 1529, 1639, 1013, 1800, 2771, 1480, 2212, 836, 311, 571, 1593, 1985, 1932, 85, 2794, 314, 527, 1556, 194, 143, 359, 1795, 23, 282, 2894, 1168, 2889, 2142, 840, 700, 1472, 1410, 2870, 1565, 151, 2640, 1100, 1892, 153, 663, 123, 644, 2252, 279, 2343, 1179, 180, 1833, 997, 1745, 2061, 851, 1427, 1328, 58, 1522, 538, 2796, 1274, 142, 2782, 365, 1004, 1031, 1917, 1678, 911, 1035, 1236, 2660, 2835, 959, 2832, 1617, 657, 1789, 1477, 2526, 1823, 1895, 3086, 2743, 2564, 2987, 1530, 416, 1725, 1918, 741, 2531, 2041, 1493, 1708, 2425, 189, 2157, 1471, 1989, 1122, 1699, 2554, 654, 2435, 280, 1275, 2278, 2005, 489, 2310, 1947, 838, 2065, 1461, 494, 982, 1325, 2037, 2258, 2696, 1458, 2344, 2577, 1554, 1969, 73, 2551, 2228, 2788, 161, 815, 3060, 1609, 1017, 2966, 237, 389, 340, 1158, 1250, 1361, 2902, 1434, 830, 1339, 2395, 2955, 977, 810, 1677, 366, 1896, 2107, 2960, 974, 2176, 3014, 2933, 1781, 3022, 1341, 373, 2600, 155, 1625, 156, 2658, 2615, 2273, 2621, 828, 1831, 1295, 1373, 57, 302, 748, 2593, 932, 1208, 231, 1506, 761, 2519, 1219, 806, 681, 1378, 1758, 859, 1392, 1362, 2110, 2237, 1730, 825, 622, 2092, 39, 957, 2133, 2909, 1262, 1962, 2366, 2767, 166, 3026, 385, 2666, 1728, 289, 2429, 778, 2525, 1196, 2164, 865, 989, 223, 1575, 607, 1991, 445, 582, 2098, 1942, 364, 26, 843, 1857, 1209, 923, 1764, 1809, 2555, 679, 2857, 1541, 1222, 16, 3103, 596, 1824, 929, 1863, 710, 946, 2514, 516, 2067, 1669, 2603, 2247, 2421, 1076, 1557, 2201, 1239, 504, 2898, 1576, 2968, 614, 1143, 444, 2843, 777, 2591, 2645, 1380, 1308, 520, 191, 1460, 725, 2415, 2963, 886, 2426, 71, 1002, 2441, 1968, 2826, 2059, 1797, 1021, 1767, 966, 892, 1082, 1986, 1202, 1695, 2219, 1610, 2566, 931, 650, 1803, 119, 3009, 1521, 1512, 753, 674, 1203, 3101, 1737, 2716, 854, 1762, 1722, 2691, 2931, 2312, 1832, 2408, 1842, 2152, 2910, 2173, 1374, 1812, 2075, 529, 732, 2002, 667, 1036, 132, 720, 70, 767, 1442, 278, 324, 1504, 1257, 850, 1138, 1358, 1735, 2684, 2393, 207, 1109, 100, 2423, 2052, 312, 174, 1829, 1636, 794, 3006, 2323, 2369, 1497, 1437, 1241, 1786, 958, 3075, 2129, 1618, 513, 1407, 2631, 1217, 3110, 1290, 2740, 2976, 140, 2795, 295, 2518, 1193, 2995, 1446, 1956, 1120, 933, 61, 2025, 724, 294, 2697, 38, 1806, 1893, 2703, 2447, 379, 2222, 380, 1376, 887, 1538, 1591, 2644, 3095, 1924, 2391, 3043, 1406, 2977, 3065, 996, 1106, 1999, 1194, 647, 1165, 2010, 2539, 1300, 120, 1079, 1839, 1775, 336, 1533, 2479, 218, 1640, 1272, 3044, 3070, 2850, 1564, 612, 897, 134, 121, 99, 1170, 902, 1314, 1182, 689, 2793, 1883, 1482, 751, 3061, 2399, 2922, 449, 2302, 2106, 3033, 2546, 808, 984, 313, 1298, 2649, 2568, 3098, 59, 2361, 1515, 2731, 1711, 2091, 749, 1566, 1359, 968, 2372, 1481, 576, 1444, 1455, 2056, 225, 2999, 1899, 1998, 1251, 2119, 51, 1190, 1811, 284, 490, 597, 536, 2365, 738, 179, 2756, 1113, 1799, 274, 2625, 1980, 1753, 2868, 1494, 8, 1507, 1485, 1750, 515, 1638, 1069, 640, 1265, 2096, 1860, 2379, 1312, 1438, 709, 1604, 401, 2710, 1687, 2263, 1572, 339, 390, 2079, 2303, 1561, 2709, 1702, 1009, 2040, 857, 2806, 293, 1039, 2134, 2680, 682, 1747, 2410, 2507, 2630, 2628, 1508, 2701, 2678, 498, 643, 425, 2419, 2022, 1703, 197, 2230, 1435, 230, 1156, 903, 1065, 2341, 3041, 740, 486, 1281, 2674, 2224, 300, 927, 1127, 2653, 2491, 2397, 1807, 2084, 227, 1898, 1954, 1042, 1516, 2493, 1552, 1012, 2264, 1841, 1643, 3048, 2386, 1448, 880, 2012, 234, 1470, 835, 1862, 592, 1149, 1903, 2466, 980, 874, 762, 1768, 362, 1606, 2487, 2175, 1596, 2822, 2439, 1614, 2299, 1020, 935, 1386, 1656, 2309, 1357, 1160, 1377, 1637, 765, 1215, 2838, 2257, 423, 690, 1454, 1096, 987, 2839, 774, 2751, 1173, 325, 2496, 2639, 2610, 695, 221, 1902, 1977, 2345, 1612, 2455, 1981, 2846, 735, 396, 2786, 2053, 2742, 2280, 2246, 1920, 555, 1412, 1727, 2800, 2582, 1216, 308, 152, 1894, 2585, 1834, 233, 131, 1181, 2847, 2523, 2318, 992, 1287, 2815, 474, 1394, 1436, 1648, 1310, 420, 266, 714, 470, 135, 2524, 1790, 2573, 2286, 2308, 361, 2235, 925, 2702, 1129, 2279, 1057, 13, 92, 613, 1001, 1279, 2648, 2373, 2155, 1201, 623, 1854, 1905, 1660, 533, 1704, 2272, 545, 2622, 2944, 83, 1140, 1974, 315, 2074, 953, 950, 1230, 2293, 1301, 1363, 628, 2717, 2014, 1463, 1315, 2911, 1045, 2706, 2083, 2277, 1685, 970, 2066, 466, 137, 780, 488, 2162, 2472, 1075, 2440, 904, 1608, 104, 747, 209, 2321, 2865, 451, 2023, 1395, 487, 2695, 723, 990, 1466, 2478, 2887, 567, 1421, 1555, 1818, 1683, 1519, 685, 2798, 391, 729, 1041, 870, 829, 1005, 611, 3032, 1131, 1098, 433, 62, 1934, 17, 1684, 818, 866, 2139, 769, 2467, 1095, 1483, 2314, 2937, 2854, 72, 2780, 1623, 3016, 2612, 2433, 2921, 2791, 268, 1233, 47, 2291, 1228, 377, 1408, 1549, 3091, 1499, 1177, 1235, 1911, 1372, 2730, 694, 1888, 2891, 3050, 1573, 589, 964, 1447, 642, 2192, 2486, 337, 2377, 906, 1071, 2662, 2007, 554, 298, 2371, 797, 2917, 711, 1796, 1867, 2438, 2863, 1647, 2027, 634, 1773, 2776, 2287, 2161, 550, 1674, 842, 2522, 2137, 873, 2699, 2346, 172, 578, 820};

//        String s = s = "abcab", p = "abc";
//        int[] removable = {0, 1, 2, 3, 4};


        Properties properties = new Properties();
        InputStream is = MaximumRemovalsSolution.class.getResourceAsStream("/application.properties");
        properties.load(is);

        String s = (String) properties.get("s");
        String p = (String) properties.get("p");
        String rStr = (String) properties.get("r");
        String[] rStrAarray = rStr.split(",");
        int count = rStrAarray.length;
        int[] removable = new int[count];

        for (int i = 0; i < count; i++) {
            removable[i] = Integer.parseInt(rStrAarray[i].trim());
        }

        MaximumRemovalsSolution ms = new MaximumRemovalsSolution();
        long startT = System.currentTimeMillis();
        //int r = ms.maximumRemovals(s, p, removable);
        long endT = System.currentTimeMillis();
        long duration = endT - startT;
        System.out.println("cost :" + duration + " ms");
        //System.out.println(r);
    }

    public int maximumRemovalsV1(String s, String p, int[] removable) {
        char[] srcArray = s.toCharArray();
        for (int i = 0; i < removable.length; i++) {
            int index = removable[i];
            srcArray[index] = '#';
            if (!isSubsequence(srcArray, p)) {
                return i;
            }
        }
        return removable.length;
    }

    public int maximumRemovalsV2(String s, String p, int[] removable) {

        char[] srcArray = s.toCharArray();
        int start = 0;
        int end = srcArray.length / 2;

        if (maximumRemovalsCore(srcArray, p, removable, start, end)) {
            maximumRemovalsCore(srcArray, p, removable, end + 1, removable.length / 2);
        }
        for (int i = 0; i < removable.length; i++) {
            int index = removable[i];
            srcArray[index] = '#';
            if (!isSubsequence(srcArray, p)) {
                return i;
            }
        }
        return removable.length;
    }

    private boolean maximumRemovalsCore(char[] srcArray, String p, int[] removable, int start, int end) {
        return true;
    }


    private boolean isSubsequence(char[] tempStr, String p) {
        int j = 0;
        for (int i = 0; i < p.length(); i++) {
            boolean isSubsequenceFlag = false;

            for (; j < tempStr.length; ) {
                if (p.charAt(i) == tempStr[j]) {
                    isSubsequenceFlag = true;
                    j = j + 1;
                    break;
                } else {
                    j = j + 1;
                }
            }

            if (isSubsequenceFlag == false) {
                return false;
            }
        }

        return true;
    }
}
