package com.example.advent2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D1Test {

    @Test
    void calculate() {
        Integer result = new D1().calculate(testData);
        Assertions.assertEquals(11, result);
    }


    String testData =
            "3   4\n" +
            "4   3\n" +
            "2   5\n" +
            "1   3\n" +
            "3   9\n" +
            "3   3";

    String realData = "" +
            "66845   37619\n" +
            "94793   99076\n" +
            "76946   36179\n" +
            "27374   48777\n" +
            "47847   92154\n" +
            "83270   97857\n" +
            "19354   94331\n" +
            "69716   58559\n" +
            "16902   36957\n" +
            "51817   88003\n" +
            "40758   64262\n" +
            "39074   90635\n" +
            "34632   79874\n" +
            "64980   96787\n" +
            "96137   94559\n" +
            "55489   98589\n" +
            "95130   76776\n" +
            "50275   50416\n" +
            "46438   49722\n" +
            "34182   49722\n" +
            "99196   51678\n" +
            "28426   49456\n" +
            "55782   77278\n" +
            "96554   38327\n" +
            "92781   25688\n" +
            "66818   64897\n" +
            "83432   67261\n" +
            "92511   85918\n" +
            "87928   74826\n" +
            "45552   37494\n" +
            "60234   58251\n" +
            "34717   40758\n" +
            "17406   40666\n" +
            "29863   13598\n" +
            "30715   16605\n" +
            "79985   24806\n" +
            "19498   33371\n" +
            "45577   59103\n" +
            "22430   97187\n" +
            "60651   52438\n" +
            "24435   14715\n" +
            "47805   33629\n" +
            "21747   21255\n" +
            "42759   37159\n" +
            "81798   25688\n" +
            "69888   75513\n" +
            "10983   57175\n" +
            "58312   51968\n" +
            "86884   41517\n" +
            "84419   46068\n" +
            "18170   76776\n" +
            "18387   30282\n" +
            "30887   51117\n" +
            "27509   49568\n" +
            "79888   65951\n" +
            "84877   31605\n" +
            "37741   70988\n" +
            "56232   51993\n" +
            "66360   34958\n" +
            "35077   60422\n" +
            "11529   96255\n" +
            "83449   21189\n" +
            "65777   39047\n" +
            "92759   70579\n" +
            "36784   34261\n" +
            "44166   77293\n" +
            "27169   46068\n" +
            "47337   15975\n" +
            "58412   48777\n" +
            "44195   71990\n" +
            "86636   25688\n" +
            "30002   64342\n" +
            "92886   31836\n" +
            "47608   76776\n" +
            "93286   93216\n" +
            "95162   72607\n" +
            "28232   49722\n" +
            "36024   42759\n" +
            "79729   44744\n" +
            "46188   90896\n" +
            "36793   40758\n" +
            "43516   69333\n" +
            "20294   69351\n" +
            "39704   65846\n" +
            "12801   75185\n" +
            "29338   69351\n" +
            "87398   33648\n" +
            "43037   40666\n" +
            "48777   48777\n" +
            "73934   51968\n" +
            "63516   67431\n" +
            "91790   94559\n" +
            "86093   50924\n" +
            "80995   95426\n" +
            "18788   69351\n" +
            "55112   58623\n" +
            "50558   51968\n" +
            "50125   48777\n" +
            "70970   65082\n" +
            "95693   34007\n" +
            "17814   75466\n" +
            "94946   34672\n" +
            "28046   18149\n" +
            "41708   92261\n" +
            "94045   40666\n" +
            "43687   64262\n" +
            "61579   48777\n" +
            "40428   60422\n" +
            "22420   32085\n" +
            "81816   40758\n" +
            "46315   42253\n" +
            "13240   48777\n" +
            "14096   50416\n" +
            "74231   98724\n" +
            "65623   29631\n" +
            "93360   51968\n" +
            "23203   13106\n" +
            "62141   96255\n" +
            "78614   44089\n" +
            "25431   25688\n" +
            "40555   37905\n" +
            "69148   67431\n" +
            "59262   72776\n" +
            "69333   40758\n" +
            "44889   40666\n" +
            "75646   80493\n" +
            "96536   65674\n" +
            "52772   55418\n" +
            "89647   40758\n" +
            "15843   14319\n" +
            "96124   10675\n" +
            "44307   65041\n" +
            "26300   19974\n" +
            "51312   78939\n" +
            "80629   88003\n" +
            "33658   72722\n" +
            "82408   51968\n" +
            "58384   40362\n" +
            "96798   51968\n" +
            "39019   64262\n" +
            "53075   69333\n" +
            "90232   81066\n" +
            "70094   84299\n" +
            "29829   64262\n" +
            "22687   30237\n" +
            "36509   31836\n" +
            "65164   49722\n" +
            "97198   73460\n" +
            "94559   32258\n" +
            "23976   75804\n" +
            "68670   45453\n" +
            "35761   33638\n" +
            "89859   30972\n" +
            "87196   48777\n" +
            "93726   73290\n" +
            "25588   40666\n" +
            "82420   68892\n" +
            "39195   66867\n" +
            "18964   26674\n" +
            "76776   45413\n" +
            "81228   60422\n" +
            "48337   92298\n" +
            "35288   50416\n" +
            "31186   94774\n" +
            "62040   83156\n" +
            "82769   40666\n" +
            "75516   52772\n" +
            "46916   83286\n" +
            "77933   62114\n" +
            "92256   68878\n" +
            "32048   67431\n" +
            "31355   92298\n" +
            "81356   81828\n" +
            "29014   64443\n" +
            "40593   76965\n" +
            "67982   92627\n" +
            "57605   77293\n" +
            "59621   23426\n" +
            "71053   15293\n" +
            "58788   33577\n" +
            "96408   15826\n" +
            "21328   16605\n" +
            "60042   38036\n" +
            "26150   16605\n" +
            "36476   45576\n" +
            "98875   26150\n" +
            "50224   26150\n" +
            "13099   77512\n" +
            "24240   57493\n" +
            "14259   36228\n" +
            "25943   71801\n" +
            "69018   15570\n" +
            "64982   29117\n" +
            "56462   42759\n" +
            "18046   40666\n" +
            "78056   26150\n" +
            "34273   50416\n" +
            "51578   73053\n" +
            "28229   51968\n" +
            "19334   81510\n" +
            "74063   22991\n" +
            "64637   99076\n" +
            "63440   96255\n" +
            "69596   90956\n" +
            "44661   60422\n" +
            "83603   73568\n" +
            "47360   25240\n" +
            "38361   56084\n" +
            "30109   49115\n" +
            "54979   49722\n" +
            "57864   76776\n" +
            "11404   23775\n" +
            "31046   84459\n" +
            "42983   63211\n" +
            "82072   21091\n" +
            "93495   31277\n" +
            "14189   73053\n" +
            "36367   50416\n" +
            "99522   29631\n" +
            "26894   44711\n" +
            "20066   12397\n" +
            "51211   69351\n" +
            "75520   71791\n" +
            "66473   41543\n" +
            "41955   76776\n" +
            "26371   45285\n" +
            "73611   51968\n" +
            "23686   46068\n" +
            "85473   60422\n" +
            "91840   30237\n" +
            "64262   35142\n" +
            "16860   48543\n" +
            "89770   81829\n" +
            "25598   48534\n" +
            "80127   48777\n" +
            "91437   23375\n" +
            "68177   25777\n" +
            "38952   90058\n" +
            "24402   46233\n" +
            "47962   16605\n" +
            "35661   77293\n" +
            "92555   69333\n" +
            "46076   73053\n" +
            "21462   50298\n" +
            "77271   20126\n" +
            "81010   71068\n" +
            "22322   51968\n" +
            "54671   16605\n" +
            "42034   43993\n" +
            "61234   16605\n" +
            "11778   48777\n" +
            "73064   96914\n" +
            "92302   66267\n" +
            "88810   39985\n" +
            "28987   49722\n" +
            "19948   63051\n" +
            "46165   42759\n" +
            "80483   32007\n" +
            "10186   87088\n" +
            "50266   98182\n" +
            "38661   60422\n" +
            "43071   29117\n" +
            "29149   90127\n" +
            "20786   92298\n" +
            "41543   63002\n" +
            "65554   44245\n" +
            "38133   50446\n" +
            "83184   43685\n" +
            "81455   30237\n" +
            "50181   20015\n" +
            "21588   41543\n" +
            "71901   77005\n" +
            "56580   67190\n" +
            "92298   30290\n" +
            "12615   43868\n" +
            "54771   97825\n" +
            "40608   83376\n" +
            "74661   81327\n" +
            "74667   27063\n" +
            "91093   69333\n" +
            "78147   74050\n" +
            "88520   67431\n" +
            "83147   58241\n" +
            "32466   96255\n" +
            "88003   26594\n" +
            "48870   44355\n" +
            "57990   33895\n" +
            "25924   52335\n" +
            "28398   25688\n" +
            "59394   16605\n" +
            "88485   18070\n" +
            "24797   94556\n" +
            "20403   92298\n" +
            "41703   25688\n" +
            "98485   39009\n" +
            "20982   71267\n" +
            "89943   90424\n" +
            "90090   84500\n" +
            "48506   75682\n" +
            "73724   15460\n" +
            "16518   51968\n" +
            "80097   85128\n" +
            "17726   30691\n" +
            "55319   76440\n" +
            "31484   40758\n" +
            "95079   69351\n" +
            "51136   69333\n" +
            "20432   50416\n" +
            "36397   81701\n" +
            "60587   87382\n" +
            "97583   69333\n" +
            "79660   79014\n" +
            "90931   61415\n" +
            "68754   99076\n" +
            "81332   29631\n" +
            "36693   18053\n" +
            "83807   63785\n" +
            "69967   41543\n" +
            "42871   98738\n" +
            "95094   91288\n" +
            "99212   99076\n" +
            "44058   84467\n" +
            "80641   34674\n" +
            "88334   29631\n" +
            "88355   71891\n" +
            "23565   64262\n" +
            "64119   54463\n" +
            "17173   36522\n" +
            "28557   31472\n" +
            "55707   49080\n" +
            "60573   53380\n" +
            "78740   48777\n" +
            "25688   40758\n" +
            "61756   50713\n" +
            "42962   94559\n" +
            "29631   92298\n" +
            "94426   67431\n" +
            "98512   82316\n" +
            "68213   69351\n" +
            "89436   29117\n" +
            "52114   74278\n" +
            "50779   18690\n" +
            "37430   18749\n" +
            "41985   87256\n" +
            "18966   73331\n" +
            "46251   69146\n" +
            "77421   78181\n" +
            "61790   45476\n" +
            "74498   10793\n" +
            "69841   82893\n" +
            "65897   20462\n" +
            "41449   29160\n" +
            "48907   44418\n" +
            "81437   40758\n" +
            "59295   67431\n" +
            "83332   89658\n" +
            "72986   37494\n" +
            "96096   50416\n" +
            "61423   41543\n" +
            "17994   96255\n" +
            "61296   15425\n" +
            "88163   59232\n" +
            "54306   51570\n" +
            "95733   61049\n" +
            "99042   15221\n" +
            "68770   71427\n" +
            "88129   69333\n" +
            "33732   92099\n" +
            "77286   61983\n" +
            "90425   60422\n" +
            "15280   46859\n" +
            "31735   70146\n" +
            "52247   13562\n" +
            "30396   40758\n" +
            "99667   30237\n" +
            "51830   79901\n" +
            "83666   25524\n" +
            "86580   98750\n" +
            "85254   48777\n" +
            "42725   11056\n" +
            "23687   97931\n" +
            "22760   94009\n" +
            "46614   77846\n" +
            "72811   24806\n" +
            "54977   49722\n" +
            "29431   73999\n" +
            "18885   40666\n" +
            "36487   64262\n" +
            "89636   50324\n" +
            "35161   49495\n" +
            "81599   67431\n" +
            "88407   33080\n" +
            "22435   50416\n" +
            "79005   10940\n" +
            "57331   41543\n" +
            "22158   40666\n" +
            "96696   30237\n" +
            "70561   45453\n" +
            "73421   60631\n" +
            "61118   43928\n" +
            "42519   79091\n" +
            "43521   64262\n" +
            "63402   15989\n" +
            "45694   95467\n" +
            "76105   44778\n" +
            "62478   68359\n" +
            "12358   99076\n" +
            "86440   88199\n" +
            "87086   83286\n" +
            "53389   39542\n" +
            "85805   31836\n" +
            "67650   68375\n" +
            "15685   63010\n" +
            "58192   46795\n" +
            "47818   92298\n" +
            "11074   94986\n" +
            "71914   40666\n" +
            "93767   14418\n" +
            "15245   79805\n" +
            "61703   69333\n" +
            "98920   26347\n" +
            "39398   43675\n" +
            "24806   93670\n" +
            "95455   83582\n" +
            "31836   42759\n" +
            "75823   89112\n" +
            "76495   95693\n" +
            "30421   64262\n" +
            "29524   69542\n" +
            "87652   26150\n" +
            "28324   60422\n" +
            "76379   22670\n" +
            "21066   20848\n" +
            "48616   71126\n" +
            "27230   73053\n" +
            "72632   73053\n" +
            "68412   69333\n" +
            "93254   71387\n" +
            "58582   40758\n" +
            "49794   41543\n" +
            "47461   60562\n" +
            "76885   14543\n" +
            "64004   73230\n" +
            "32657   96255\n" +
            "53863   10455\n" +
            "20628   35993\n" +
            "91608   87804\n" +
            "75577   69351\n" +
            "71476   64262\n" +
            "81995   23722\n" +
            "50925   69351\n" +
            "11299   77938\n" +
            "35420   99076\n" +
            "10331   29117\n" +
            "15779   75594\n" +
            "85678   37494\n" +
            "91928   42759\n" +
            "63346   75594\n" +
            "66976   96255\n" +
            "83382   88003\n" +
            "57567   44223\n" +
            "57699   13304\n" +
            "87134   99196\n" +
            "75545   76776\n" +
            "25631   41543\n" +
            "87276   10800\n" +
            "56940   51968\n" +
            "84938   42251\n" +
            "95193   54917\n" +
            "29270   34604\n" +
            "89353   63191\n" +
            "40688   42759\n" +
            "66751   53340\n" +
            "66452   16819\n" +
            "38862   17153\n" +
            "96222   46438\n" +
            "87343   57690\n" +
            "46164   57572\n" +
            "99417   27010\n" +
            "70060   10746\n" +
            "71154   34499\n" +
            "12509   48869\n" +
            "93651   78940\n" +
            "71299   73847\n" +
            "10832   30237\n" +
            "52974   64262\n" +
            "40981   11346\n" +
            "29705   40758\n" +
            "67938   95118\n" +
            "60177   49969\n" +
            "47250   91132\n" +
            "54643   25688\n" +
            "85588   76776\n" +
            "98925   69333\n" +
            "60422   90370\n" +
            "24036   39886\n" +
            "29403   40758\n" +
            "74173   25688\n" +
            "55986   40758\n" +
            "25014   69333\n" +
            "12619   88003\n" +
            "94185   66972\n" +
            "36302   76776\n" +
            "80587   47593\n" +
            "69768   39980\n" +
            "69155   11763\n" +
            "50416   78224\n" +
            "46304   16273\n" +
            "96705   69351\n" +
            "28345   35177\n" +
            "77293   10590\n" +
            "12724   52945\n" +
            "35375   78625\n" +
            "75160   45453\n" +
            "46386   65833\n" +
            "39994   48140\n" +
            "91271   59925\n" +
            "29612   77293\n" +
            "41036   88472\n" +
            "81721   69333\n" +
            "17164   69333\n" +
            "59045   55408\n" +
            "47643   48777\n" +
            "88393   31836\n" +
            "84088   29471\n" +
            "59047   99076\n" +
            "78516   76776\n" +
            "15157   99196\n" +
            "43690   94559\n" +
            "75594   53479\n" +
            "44896   71111\n" +
            "94548   39265\n" +
            "83041   42184\n" +
            "96815   51415\n" +
            "32828   70721\n" +
            "58699   81992\n" +
            "31287   64262\n" +
            "26029   37494\n" +
            "65166   83286\n" +
            "54211   99076\n" +
            "83286   91733\n" +
            "56093   73053\n" +
            "72216   58645\n" +
            "41450   27606\n" +
            "40073   49722\n" +
            "95257   78671\n" +
            "45206   57288\n" +
            "77156   16605\n" +
            "95757   87915\n" +
            "37072   43889\n" +
            "64269   43521\n" +
            "32134   94350\n" +
            "17176   28044\n" +
            "96935   16605\n" +
            "12632   39455\n" +
            "58840   64262\n" +
            "45556   60422\n" +
            "56436   23521\n" +
            "63022   10638\n" +
            "58109   65191\n" +
            "20092   51968\n" +
            "94565   87895\n" +
            "95740   67431\n" +
            "82012   14463\n" +
            "95332   76776\n" +
            "10057   36067\n" +
            "90826   85685\n" +
            "26656   37494\n" +
            "21477   28483\n" +
            "69198   30835\n" +
            "86852   31534\n" +
            "99374   40666\n" +
            "67436   26735\n" +
            "69091   37640\n" +
            "98680   31836\n" +
            "62432   46068\n" +
            "81423   37494\n" +
            "65121   49722\n" +
            "63197   92795\n" +
            "61748   89795\n" +
            "48450   41543\n" +
            "22248   50416\n" +
            "53155   29214\n" +
            "66777   83286\n" +
            "61747   30639\n" +
            "77640   31836\n" +
            "30701   73053\n" +
            "77911   39784\n" +
            "68586   93617\n" +
            "16193   95734\n" +
            "87617   94302\n" +
            "30286   81591\n" +
            "37535   95903\n" +
            "33511   95693\n" +
            "13847   94086\n" +
            "48968   92039\n" +
            "18649   81319\n" +
            "90213   51247\n" +
            "19938   14934\n" +
            "45563   77293\n" +
            "65848   83368\n" +
            "15964   74755\n" +
            "46068   23448\n" +
            "42958   13602\n" +
            "75671   27217\n" +
            "29655   51968\n" +
            "22699   25688\n" +
            "51147   42589\n" +
            "94306   42759\n" +
            "25877   30237\n" +
            "65736   73053\n" +
            "90797   16605\n" +
            "37067   95623\n" +
            "83464   91292\n" +
            "42197   45801\n" +
            "91306   99076\n" +
            "60911   92298\n" +
            "34318   33706\n" +
            "38793   96334\n" +
            "27850   37433\n" +
            "14650   64262\n" +
            "91128   64339\n" +
            "32458   98055\n" +
            "54600   62677\n" +
            "98050   75988\n" +
            "86045   41543\n" +
            "42279   19215\n" +
            "42179   41543\n" +
            "74312   39080\n" +
            "79748   67431\n" +
            "40215   77293\n" +
            "41710   90776\n" +
            "30328   68060\n" +
            "26336   88003\n" +
            "36852   22273\n" +
            "40112   16836\n" +
            "85174   16605\n" +
            "71517   32703\n" +
            "67431   99004\n" +
            "43343   64262\n" +
            "13731   22989\n" +
            "13807   54987\n" +
            "67892   39600\n" +
            "27164   13761\n" +
            "73866   29117\n" +
            "49004   11308\n" +
            "30611   79799\n" +
            "99434   64262\n" +
            "39641   96255\n" +
            "37656   46551\n" +
            "31848   30237\n" +
            "98478   83598\n" +
            "98613   17687\n" +
            "82739   36729\n" +
            "90600   41659\n" +
            "11405   52772\n" +
            "38095   26098\n" +
            "78900   49223\n" +
            "90011   64515\n" +
            "83200   65037\n" +
            "71310   31350\n" +
            "29261   29631\n" +
            "99897   41543\n" +
            "10080   60422\n" +
            "53548   22585\n" +
            "33783   94884\n" +
            "13126   76776\n" +
            "19067   48777\n" +
            "60524   31565\n" +
            "78024   69351\n" +
            "78854   66750\n" +
            "45049   47031\n" +
            "99076   25688\n" +
            "38748   81291\n" +
            "10930   57953\n" +
            "59839   26241\n" +
            "78585   86796\n" +
            "59376   49722\n" +
            "60726   60127\n" +
            "81844   97760\n" +
            "53820   37832\n" +
            "58200   51968\n" +
            "39265   60422\n" +
            "60470   33170\n" +
            "91160   96442\n" +
            "27028   85013\n" +
            "47223   41543\n" +
            "76737   16605\n" +
            "57526   56760\n" +
            "65236   31836\n" +
            "53301   85609\n" +
            "24915   16605\n" +
            "35708   83286\n" +
            "95380   27448\n" +
            "84774   28106\n" +
            "41172   68961\n" +
            "91822   90839\n" +
            "40133   50910\n" +
            "12658   69351\n" +
            "68683   61451\n" +
            "48857   43558\n" +
            "75612   40666\n" +
            "68638   84502\n" +
            "50216   77750\n" +
            "99960   58184\n" +
            "84452   13882\n" +
            "45383   49722\n" +
            "75492   60195\n" +
            "13480   22237\n" +
            "50803   84944\n" +
            "54012   60422\n" +
            "84902   96255\n" +
            "17970   76776\n" +
            "11010   86694\n" +
            "99306   49722\n" +
            "40510   64262\n" +
            "49829   88882\n" +
            "59557   60358\n" +
            "85594   67431\n" +
            "59545   67431\n" +
            "20954   40666\n" +
            "12472   78637\n" +
            "70813   89650\n" +
            "99797   81151\n" +
            "77207   49160\n" +
            "49923   51618\n" +
            "65898   30237\n" +
            "37494   24806\n" +
            "85492   83863\n" +
            "39497   37494\n" +
            "36089   14785\n" +
            "20089   42979\n" +
            "96255   96255\n" +
            "32410   46438\n" +
            "48216   96255\n" +
            "76597   54602\n" +
            "53910   18651\n" +
            "15354   14547\n" +
            "98751   90551\n" +
            "74557   90793\n" +
            "86473   64457\n" +
            "57086   86585\n" +
            "69351   16557\n" +
            "49032   10281\n" +
            "95909   64037\n" +
            "98841   26150\n" +
            "38404   25688\n" +
            "53132   48777\n" +
            "41823   99294\n" +
            "73232   16605\n" +
            "14338   74560\n" +
            "20654   61132\n" +
            "39466   77293\n" +
            "17828   99107\n" +
            "44233   42759\n" +
            "75537   82505\n" +
            "97545   60422\n" +
            "16764   51968\n" +
            "17017   43797\n" +
            "70260   61407\n" +
            "85468   30237\n" +
            "37966   64262\n" +
            "49722   63390\n" +
            "55689   41072\n" +
            "47330   53047\n" +
            "94724   60422\n" +
            "28441   63752\n" +
            "27435   25688\n" +
            "49740   11717\n" +
            "34057   27423\n" +
            "64654   71907\n" +
            "83242   29117\n" +
            "97554   73053\n" +
            "42324   69351\n" +
            "43064   47040\n" +
            "64801   40758\n" +
            "55649   48777\n" +
            "71147   41347\n" +
            "90522   60422\n" +
            "39447   28206\n" +
            "26012   92655\n" +
            "12500   21088\n" +
            "96913   96255\n" +
            "73053   21102\n" +
            "96929   64262\n" +
            "17234   49722\n" +
            "71663   69333\n" +
            "27255   61341\n" +
            "20631   42759\n" +
            "53872   89055\n" +
            "21030   42759\n" +
            "63642   92298\n" +
            "37041   13379\n" +
            "62151   99076\n" +
            "44779   44361\n" +
            "33142   70645\n" +
            "34298   99076\n" +
            "74521   71083\n" +
            "97108   42956\n" +
            "77170   40666\n" +
            "82868   54524\n" +
            "60362   38781\n" +
            "66295   14324\n" +
            "18853   92189\n" +
            "86177   76776\n" +
            "24054   49722\n" +
            "64974   22099\n" +
            "88395   26150\n" +
            "24079   52772\n" +
            "90673   26493\n" +
            "28410   60422\n" +
            "23503   41005\n" +
            "22127   81692\n" +
            "43022   69046\n" +
            "21423   30237\n" +
            "20584   99347\n" +
            "19793   64262\n" +
            "85494   29631\n" +
            "35760   67431\n" +
            "37390   11112\n" +
            "11337   67225\n" +
            "52314   25688\n" +
            "99221   92298\n" +
            "90131   76776\n" +
            "79699   57892\n" +
            "22197   89226\n" +
            "21685   53250\n" +
            "61808   13618\n" +
            "95453   30237\n" +
            "66322   46438\n" +
            "49172   59373\n" +
            "54628   40323\n" +
            "87270   67431\n" +
            "25855   69351\n" +
            "18455   75737\n" +
            "45453   75723\n" +
            "48577   39690\n" +
            "47391   56849\n" +
            "32796   55399\n" +
            "36667   27839\n" +
            "24640   92298\n" +
            "52237   62652\n" +
            "10472   65480\n" +
            "96200   40686\n" +
            "48162   27800\n" +
            "31265   87629\n" +
            "28125   99076\n" +
            "73922   90954\n" +
            "32255   48777\n" +
            "47397   73220\n" +
            "47401   38154\n" +
            "70327   60422\n" +
            "38692   19213\n" +
            "18472   31836\n" +
            "71218   35466\n" +
            "37097   33313\n" +
            "79607   49008\n" +
            "88691   16605\n" +
            "30767   19624\n" +
            "47670   88003\n" +
            "87223   15008\n" +
            "62459   74801\n" +
            "35995   76776\n" +
            "39905   51968\n" +
            "62948   16651\n" +
            "14137   97229\n" +
            "51968   25688\n" +
            "19454   77293\n" +
            "48128   29631\n" +
            "87280   46179\n" +
            "97139   29631\n" +
            "91913   51492\n" +
            "52926   66255\n" +
            "88930   41045\n" +
            "51402   13749\n" +
            "56326   16605\n" +
            "56973   31836\n" +
            "30330   40666\n" +
            "56823   39962\n" +
            "43407   69225\n" +
            "86434   45453\n" +
            "16605   27225\n" +
            "24931   27332\n" +
            "58345   67854\n" +
            "25412   61629\n" +
            "90343   95693\n" +
            "20577   84501\n" +
            "19871   64775\n" +
            "33550   73053\n" +
            "30768   48777\n" +
            "44985   96255\n" +
            "93435   69530\n" +
            "17474   83436\n" +
            "33032   27464\n" +
            "67655   77293\n" +
            "11189   25688\n" +
            "76696   29631\n" +
            "81827   37289\n" +
            "14652   41543\n" +
            "78881   35379\n" +
            "49434   40758\n" +
            "16136   37494\n" +
            "95899   99076\n" +
            "52886   49722\n" +
            "75680   59071\n" +
            "25008   18424\n" +
            "10532   45453\n" +
            "70853   67108\n" +
            "97765   41543\n" +
            "77075   98528\n" +
            "49731   45588\n" +
            "12421   81360\n" +
            "13995   20115\n" +
            "13459   67635\n" +
            "44822   20506\n" +
            "45941   40758\n" +
            "84375   46068\n" +
            "68154   27538\n" +
            "50838   85083\n" +
            "57673   43557\n" +
            "89564   10626\n" +
            "86616   45453\n" +
            "95622   16605\n" +
            "95036   38065\n" +
            "69957   76776\n" +
            "68179   32072\n" +
            "11978   23791\n" +
            "89856   12649\n" +
            "43029   33383\n" +
            "30680   91350\n" +
            "65119   51344\n" +
            "61868   77293\n" +
            "28887   89141\n" +
            "30237   92298\n" +
            "74565   45124\n" +
            "52029   51153\n" +
            "53311   81204\n" +
            "28179   45453\n" +
            "25996   67537\n" +
            "21527   88003\n" +
            "40311   88003\n" +
            "77116   64262\n" +
            "32339   43982\n" +
            "51922   52772\n" +
            "39858   41543\n" +
            "42050   33920\n" +
            "22499   40777\n" +
            "40666   75657\n" +
            "49779   48777\n" +
            "57894   34518\n" +
            "21691   67431\n" +
            "29904   25688\n" +
            "73894   79235\n" +
            "25080   47224\n" +
            "24284   41543\n" +
            "62787   58837\n" +
            "82576   96255\n" +
            "90992   21575\n" +
            "56542   25688\n" +
            "93368   48777\n" +
            "97106   96422\n" +
            "95744   75594\n" +
            "86470   42303\n" +
            "15426   92298\n" +
            "67124   29117\n" +
            "93975   80395\n" +
            "20387   57449\n" +
            "98213   31836\n" +
            "58271   60721\n" +
            "26911   48788\n" +
            "18479   99076\n" +
            "10735   49722\n" +
            "27321   42759\n" +
            "49224   16605\n" +
            "38905   45630\n" +
            "81499   15623\n" +
            "50470   29434\n" +
            "25745   41944\n" +
            "85084   95159\n" +
            "36196   67431\n" +
            "43825   42915\n" +
            "11678   14222\n" +
            "63510   72474\n" +
            "15304   52772\n" +
            "13540   25688\n" +
            "95310   40758\n" +
            "64421   88003\n" +
            "14821   76776\n" +
            "29117   89841\n" +
            "22026   33570\n" +
            "66744   36521\n" +
            "73205   72863\n" +
            "13305   60422\n" +
            "47886   15634\n" +
            "16515   59541\n" +
            "86124   77004\n" +
            "30895   46438\n" +
            "69966   25582\n" +
            "31783   85509\n" +
            "97288   51968\n" +
            "";
}