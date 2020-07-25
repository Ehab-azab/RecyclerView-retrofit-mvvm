package com.wuhenzhizao.model;

/**
 * Created by wuhenzhizao on 2017/9/14.
 */
class Address {
    static String[] provinces = new String[]{"北京市", "天津市", "河北省", "山西省", "内蒙古自治区", "辽宁省", "吉林省", "黑龙江省", "上海市", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "广西壮族自治区", "海南省", "重庆市", "四川省", "贵州省", "云南省", "西藏自治区", "陕西省", "甘肃省", "青海省", "宁夏回族自治区", "新疆维吾尔自治区"};

    static String[][] citys = new String[][]{{"东城区", "西城区", "崇文区", "宣武区", "朝阳区", "丰台区", "石景山区", "海淀区", "石头沟区", "房山区", "通州区", "顺义区", "昌平区", "大兴区", "怀柔区", "平谷区", "密云区", "延庆区"},
            {"和平区", "河东区", "河西区", "南开区", "河北区", "红桥区", "塘沽区", "汉沽区", "大港区", "东丽区", "西青区", "津南区", "北辰区", "武清区", "宝坻区", "宁河县", "静海县", "蓟县"},
            {"石家庄市", "唐山市", "秦皇岛市", "邯郸市", "邢台市", "保定市", "张家口市", "承德市", "沧州市", "廊坊市", "衡水市"},
            {"太原市", "大同市", "阳泉市", "长治市", "晋城市", "朔州市", "晋中市", "运城市", "忻州市", "临汾市", "吕梁市"},
            {"呼和浩特市", "包头市", "乌海市", "赤峰市", "通辽市", "鄂尔多斯市", "呼伦贝尔市", "巴彦淖尔市", "乌兰察布市", "兴安盟", "锡林郭勒市", "阿拉善盟"},
            {"沈阳市", "大连市", "鞍山市", "抚顺市", "本溪市", "丹东市", "锦州市", "营口市", "阜新市", "辽阳市", "盘锦市", "铁岭市", "朝阳市", "葫芦岛市"},
            {"长春市", "吉林市", "四平市", "辽源市", "白山市", "松原市", "白城市", "延边州"},
            {"哈尔滨市", "齐齐哈尔市", "鸡西市", "鹤岗市", "双鸭山市", "大庆市", "伊春市", "佳木斯市", "七台河市", "牡丹江市", "黑河市", "绥化市", "大兴安岭地区"},
            {"黄浦区", "卢湾区", "徐汇区", "长宁区", "静安区", "普陀区", "闸北区", "虹口区", "杨浦区", "闵行区", "宝山区", "嘉定区", "浦东新区", "金山区", "松江区", "青浦区", "南汇区", "奉贤区", "崇明县"},
            {"南京市", "无锡市", "徐州市", "常州市", "苏州市", "南通市", "连云港市", "淮安市", "盐城市", "扬州市", "镇江市", "泰州市", "宿迁市"},
            {"杭州市", "宁波市", "温州市", "嘉兴市", "湖州市", "绍兴市", "金华市", "衢州市", "舟山市", "台州市", "丽水市"},
            {"合肥市", "芜湖市", "蚌埠市", "淮南市", "铜陵市", "安庆市", "黄山市", "滁州市", "阜阳市", "宿州市", "巢湖市", "六安市", "亳州市", "池州市", "宣城市"},
            {"福州市", "厦门市", "莆田市", "三明市", "泉州市", "漳州市", "南平市", "龙岩市", "宁德市"},
            {"南昌市", "景德镇市", "萍乡市", "九江市", "新余市", "鹰潭市", "赣州市", "吉安市", "宜春市", "抚州市", "上饶市"},
            {"济南市", "青岛市", "淄博市", "枣庄市", "东营市", "烟台市", "廊坊市", "济宁市", "泰安市", "威海市", "照市", "莱芜市", "临沂市", "德州市", "聊城市", "滨州市", "菏泽市"},
            {"郑州市", "开封市", "洛阳市", "平顶山市", "安阳市", "鹤壁市", "新乡市", "焦作市", "濮阳市", "许昌市", "漯河市", "三峡门市", "南阳市", "南丘市", "信阳市", "周口市", "驻马店市"},
            {"武汉市", "黄石市", "十堰市", "宜昌市", "襄樊市", "鄂州市", "荆门市", "孝感市", "荆州市", "黄冈市", "咸宁市", "随州市", "恩施市", "仙桃市", "潜江市", "天门市", "神农架林区"},
            {"长沙市", "株洲市", "湘潭市", "衡阳市", "邵阳市", "岳阳市", "常德市", "张家界市", "益阳市", "郴州市", "永州市", "怀化市", "娄底市", "湘西市"},
            {"广州市", "韶关市", "深圳市", "珠海市", "汕头市", "佛山市", "江门市", "湛江市", "茂名市", "肇庆市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市", "东莞市", "中山市", "潮州市", "揭阳市", "云浮市"},
            {"南宁市", "柳州市", "桂林市", "梧州市", "北海市", "防城港市", "钦州市", "贵港市", "玉林市", "百色市", "贺州市", "河池市", "来宾市", "崇左市"},
            {"海口市", "三亚市", "五指山市", "琼海市", "儋州市", "文昌市", "万宁市", "东方市", "安定县", "屯昌县", "澄迈县", "临高县", "白沙县", "昌江县", "乐东县", "陵水县", "保亭县", "琼中县", "西沙群岛", "南沙群岛", "中沙群岛"},
            {"万州区", "涪陵区", "渝中区", "大渡口区", "江北区", "沙坪坝区", "九龙坡区", "南岸区", "北碚区", "万盛区", "双桥区", "渝北区", "巴南区", "黔江区", "长寿区", "江津区", "合川区", "永川区", "南川区", "綦江县", "潼南县", "铜梁县", "大足县", "荣昌县", "璧山县", "梁平县", "城口县", "丰都县", "垫江县", "武隆县", "忠县", "开县", "云阳县", "奉节县", "巫山县", "巫溪县", "石柱县", "秀山县"},
            {"成都市", "自贡市", "攀枝花市", "泸州市", "德阳市", "绵阳市", "广元市", "遂宁市", "内江市", "乐山市", "南充市", "眉山市", "宜宾市", "广安市", "达州市", "雅安市", "巴中市", "资阳市", "阿坝州", "甘孜州", "凉山州"},
            {"贵阳市", "六盘水市", "遵义市", "安顺市", "铜仁地区", "黔西南州", "毕节地区", "黔东南州", "黔南州"},
            {"昆明市", "曲靖市", "玉溪市", "保山市", "昭通市", "丽江市", "普洱市", "临沧市", "文山州", "红河州", "西双版纳州", "楚雄州", "大理州", "德宏州", "怒江州", "迪庆州"},
            {"拉萨市", "昌都地区", "山南地区", "喀则地区", "那曲地区", "阿里地区", "林芝地区"},
            {"西安市", "铜川市", "宝鸡市", "咸阳市", "渭南市", "延安市", "汉中市", "榆林市", "安康市", "南洛市"},
            {"兰州市", "嘉峪关市", "金昌市", "白银市", "天水市", "武威市", "张掖市", "平凉市", "酒泉市", "庆阳市", "定西市", "陇南市", "临夏州", "甘南州"},
            {"西宁市", "海东地区", "海北州", "黄南州", "海南州", "果洛州", "玉树州", "海西州"},
            {"银川市", "石嘴山市", "吴忠市", "固原市", "中卫市"},
            {"乌鲁木齐市", "克拉玛依市", "吐鲁番地区", "哈密地区", "昌吉州", "博尔塔拉州", "巴音郭楞州", "阿克苏地区", "克孜勒苏州", "喀什地区", "和田地区", "伊犁州", "塔城地区", "阿勒泰地区", "石河子市", "阿拉尔市", "图木舒克", "五家渠市"}};
}
