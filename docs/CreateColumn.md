

# CreateColumn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**languageCode** | [**LanguageCodeEnum**](#LanguageCodeEnum) |  |  [optional] |
|**numberFormat** | [**NumberFormat**](NumberFormat.md) |  |  [optional] |
|**selectionOptions** | **List&lt;String&gt;** |  |  [optional] |
|**reference** | [**Reference**](Reference.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLELINE | &quot;singleLine&quot; |
| MULTIPLELINES | &quot;multipleLines&quot; |
| RICHTEXT | &quot;richText&quot; |
| MARKDOWN | &quot;markdown&quot; |
| SINGLESELECTION | &quot;singleSelection&quot; |
| MULTIPLESELECTIONS | &quot;multipleSelections&quot; |
| BOOLEAN | &quot;boolean&quot; |
| NUMBER | &quot;number&quot; |
| DATETIME | &quot;datetime&quot; |
| FILES | &quot;files&quot; |
| REFERENCE | &quot;reference&quot; |
| LOOKUP | &quot;lookup&quot; |
| LANGUAGE | &quot;language&quot; |
| JSON | &quot;json&quot; |
| YAML | &quot;yaml&quot; |
| HTML | &quot;html&quot; |
| FORMULA | &quot;formula&quot; |



## Enum: LanguageCodeEnum

| Name | Value |
|---- | -----|
| ENUS | &quot;enUS&quot; |
| ARSA | &quot;arSA&quot; |
| CAES | &quot;caES&quot; |
| ZHCN | &quot;zhCN&quot; |
| ZHTW | &quot;zhTW&quot; |
| DEDE | &quot;deDE&quot; |
| ITIT | &quot;itIT&quot; |
| JAJP | &quot;jaJP&quot; |
| KOKR | &quot;koKR&quot; |
| PLPL | &quot;plPL&quot; |
| PTBR | &quot;ptBR&quot; |
| RURU | &quot;ruRU&quot; |
| ESMX | &quot;esMX&quot; |
| ESLA | &quot;esLA&quot; |
| ESES | &quot;esES&quot; |
| BNBD | &quot;bnBD&quot; |
| BGBG | &quot;bgBG&quot; |
| ZHHK | &quot;zhHK&quot; |
| CSCZ | &quot;csCZ&quot; |
| DADK | &quot;daDK&quot; |
| NLNL | &quot;nlNL&quot; |
| FIFI | &quot;fiFI&quot; |
| FRFR | &quot;frFR&quot; |
| FRCA | &quot;frCA&quot; |
| ELGR | &quot;elGR&quot; |
| HEIL | &quot;heIL&quot; |
| HIIN | &quot;hiIN&quot; |
| HUHU | &quot;huHU&quot; |
| IDID | &quot;idID&quot; |
| JWID | &quot;jwID&quot; |
| LVLV | &quot;lvLV&quot; |
| MSMY | &quot;msMY&quot; |
| NONO | &quot;noNO&quot; |
| PTPT | &quot;ptPT&quot; |
| RORO | &quot;roRO&quot; |
| SKSK | &quot;skSK&quot; |
| SVSE | &quot;svSE&quot; |
| TLPH | &quot;tlPH&quot; |
| THTH | &quot;thTH&quot; |
| TRTR | &quot;trTR&quot; |
| UKUA | &quot;ukUA&quot; |
| URIN | &quot;urIN&quot; |
| VIVN | &quot;viVN&quot; |
| AFZA | &quot;afZA&quot; |
| ARAE | &quot;arAE&quot; |
| ARBH | &quot;arBH&quot; |
| ARDZ | &quot;arDZ&quot; |
| AREG | &quot;arEG&quot; |
| ARIQ | &quot;arIQ&quot; |
| ARJO | &quot;arJO&quot; |
| ARKW | &quot;arKW&quot; |
| ARLB | &quot;arLB&quot; |
| ARLY | &quot;arLY&quot; |
| ARMA | &quot;arMA&quot; |
| AROM | &quot;arOM&quot; |
| ARQA | &quot;arQA&quot; |
| ARSY | &quot;arSY&quot; |
| ARTN | &quot;arTN&quot; |
| ARYE | &quot;arYE&quot; |
| AZAZ | &quot;azAZ&quot; |
| BEBY | &quot;beBY&quot; |
| BSBA | &quot;bsBA&quot; |
| CYGB | &quot;cyGB&quot; |
| DEAT | &quot;deAT&quot; |
| DECH | &quot;deCH&quot; |
| DELI | &quot;deLI&quot; |
| DELU | &quot;deLU&quot; |
| DVMV | &quot;dvMV&quot; |
| ENAU | &quot;enAU&quot; |
| ENBZ | &quot;enBZ&quot; |
| ENCA | &quot;enCA&quot; |
| ENGB | &quot;enGB&quot; |
| ENIE | &quot;enIE&quot; |
| ENJM | &quot;enJM&quot; |
| ENNZ | &quot;enNZ&quot; |
| ENPH | &quot;enPH&quot; |
| ENTT | &quot;enTT&quot; |
| ENZA | &quot;enZA&quot; |
| ENZW | &quot;enZW&quot; |
| ESAR | &quot;esAR&quot; |
| ESBO | &quot;esBO&quot; |
| ESCL | &quot;esCL&quot; |
| ESCO | &quot;esCO&quot; |
| ESCR | &quot;esCR&quot; |
| ESDO | &quot;esDO&quot; |
| ESEC | &quot;esEC&quot; |
| ESGT | &quot;esGT&quot; |
| ESHN | &quot;esHN&quot; |
| ESNI | &quot;esNI&quot; |
| ESPA | &quot;esPA&quot; |
| ESPE | &quot;esPE&quot; |
| ESPR | &quot;esPR&quot; |
| ESPY | &quot;esPY&quot; |
| ESSV | &quot;esSV&quot; |
| ESUY | &quot;esUY&quot; |
| ESVE | &quot;esVE&quot; |
| ETEE | &quot;etEE&quot; |
| EUES | &quot;euES&quot; |
| FAIR | &quot;faIR&quot; |
| FOFO | &quot;foFO&quot; |
| FRBE | &quot;frBE&quot; |
| FRCH | &quot;frCH&quot; |
| FRLU | &quot;frLU&quot; |
| FRMC | &quot;frMC&quot; |
| GLES | &quot;glES&quot; |
| GUIN | &quot;guIN&quot; |
| HRBA | &quot;hrBA&quot; |
| HRHR | &quot;hrHR&quot; |
| HYAM | &quot;hyAM&quot; |
| ISIS | &quot;isIS&quot; |
| ITCH | &quot;itCH&quot; |
| KAGE | &quot;kaGE&quot; |
| KKKZ | &quot;kkKZ&quot; |
| KNIN | &quot;knIN&quot; |
| KOKIN | &quot;kokIN&quot; |
| KYKG | &quot;kyKG&quot; |
| LTLT | &quot;ltLT&quot; |
| MINZ | &quot;miNZ&quot; |
| MKMK | &quot;mkMK&quot; |
| MNMN | &quot;mnMN&quot; |
| MRIN | &quot;mrIN&quot; |
| MSBN | &quot;msBN&quot; |
| MTMT | &quot;mtMT&quot; |
| NBNO | &quot;nbNO&quot; |
| NLBE | &quot;nlBE&quot; |
| NNNO | &quot;nnNO&quot; |
| NSZA | &quot;nsZA&quot; |
| PAIN | &quot;paIN&quot; |
| PSAR | &quot;psAR&quot; |
| QUBO | &quot;quBO&quot; |
| QUEC | &quot;quEC&quot; |
| QUPE | &quot;quPE&quot; |
| SAIN | &quot;saIN&quot; |
| SEFI | &quot;seFI&quot; |
| SENO | &quot;seNO&quot; |
| SESE | &quot;seSE&quot; |
| SLSI | &quot;slSI&quot; |
| SQAL | &quot;sqAL&quot; |
| SRBA | &quot;srBA&quot; |
| SRRS | &quot;srRS&quot; |
| SRME | &quot;srME&quot; |
| SVFI | &quot;svFI&quot; |
| SWKE | &quot;swKE&quot; |
| SYRSY | &quot;syrSY&quot; |
| TAIN | &quot;taIN&quot; |
| TEIN | &quot;teIN&quot; |
| TNZA | &quot;tnZA&quot; |
| TTRU | &quot;ttRU&quot; |
| URPK | &quot;urPK&quot; |
| UZUZ | &quot;uzUZ&quot; |
| XHZA | &quot;xhZA&quot; |
| ZHMO | &quot;zhMO&quot; |
| ZHSG | &quot;zhSG&quot; |
| ZUZA | &quot;zuZA&quot; |
| HY | &quot;hy&quot; |
| AZ | &quot;az&quot; |
| BN | &quot;bn&quot; |
| BS | &quot;bs&quot; |
| CA | &quot;ca&quot; |
| HR | &quot;hr&quot; |
| DA | &quot;da&quot; |
| NL | &quot;nl&quot; |
| EN | &quot;en&quot; |
| FI | &quot;fi&quot; |
| FR | &quot;fr&quot; |
| HI | &quot;hi&quot; |
| HU | &quot;hu&quot; |
| ID | &quot;id&quot; |
| IT | &quot;it&quot; |
| MI | &quot;mi&quot; |
| PS | &quot;ps&quot; |
| RU | &quot;ru&quot; |
| SL | &quot;sl&quot; |
| ES | &quot;es&quot; |
| SW | &quot;sw&quot; |
| TA | &quot;ta&quot; |
| UR | &quot;ur&quot; |
| AF | &quot;af&quot; |
| ET | &quot;et&quot; |
| GL | &quot;gl&quot; |
| JA | &quot;ja&quot; |
| KK | &quot;kk&quot; |
| KY | &quot;ky&quot; |
| MK | &quot;mk&quot; |
| MS | &quot;ms&quot; |
| SE | &quot;se&quot; |
| PL | &quot;pl&quot; |
| PA | &quot;pa&quot; |
| RO | &quot;ro&quot; |
| SK | &quot;sk&quot; |
| SV | &quot;sv&quot; |
| TT | &quot;tt&quot; |
| TE | &quot;te&quot; |
| TR | &quot;tr&quot; |
| UZ | &quot;uz&quot; |
| VI | &quot;vi&quot; |
| EU | &quot;eu&quot; |
| BE | &quot;be&quot; |
| CS | &quot;cs&quot; |
| DE | &quot;de&quot; |
| GU | &quot;gu&quot; |
| HE | &quot;he&quot; |
| IS | &quot;is&quot; |
| KO | &quot;ko&quot; |
| LT | &quot;lt&quot; |
| MR | &quot;mr&quot; |
| MN | &quot;mn&quot; |
| NB | &quot;nb&quot; |
| NN | &quot;nn&quot; |
| PT | &quot;pt&quot; |
| SA | &quot;sa&quot; |
| TN | &quot;tn&quot; |
| UK | &quot;uk&quot; |
| XH | &quot;xh&quot; |
| SQ | &quot;sq&quot; |
| AR | &quot;ar&quot; |
| BG | &quot;bg&quot; |
| ZH | &quot;zh&quot; |
| DV | &quot;dv&quot; |
| FO | &quot;fo&quot; |
| FA | &quot;fa&quot; |
| KA | &quot;ka&quot; |
| EL | &quot;el&quot; |
| KN | &quot;kn&quot; |
| LV | &quot;lv&quot; |
| MT | &quot;mt&quot; |
| QU | &quot;qu&quot; |
| SR | &quot;sr&quot; |
| TL | &quot;tl&quot; |
| TH | &quot;th&quot; |
| CY | &quot;cy&quot; |
| ZU | &quot;zu&quot; |
| NO | &quot;no&quot; |



