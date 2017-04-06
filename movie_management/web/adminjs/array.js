
window.onload=function(){
  //创建省份
    createcitys();
     //选择省份后，切换对应城市列表
    city.onchange=createCities;
    //创建省份
    createcitys1();
     //选择省份后，切换对应城市列表
    city1.onchange=createCities1;
}
//声明省份数组
var citys=['请选择','上海','珠海','广州','深圳'];
//声明城市数组
var cities=[
    [],
    ['黄浦区','静安区','长宁区','浦东区'],
    ['香洲区','金湾区','斗门区'],
    ['从化区','花都区','白云区','天河区','海珠区','番禺区',],
    ['福田区','罗湖区','南山区','宝安区','龙岗区','盐田区']
];
//声明获取的省份节点元素
var city=document.getElementById("city");
//声明获取的城市节点元素
var area=document.getElementById("area");

function createcitys(){
    for(var i in citys){
        //获取下拉列表集合实例
        var op=new Option(citys[i],citys[i]);
        //将下拉列表各元素添加到省份元素中
        city.options.add(op);
    }
}

function createCities(){
    //获取省份选中项的索引
    var index=city.selectedIndex;
    //将area下的所有原有option移除
    area.options.length=0;
    //添加对应城市下拉列表
    for(var i in cities[index]){
        var op=new Option(cities[index][i],cities[index][i]);
        area.options.add(op);
    }
}

//声明获取的省份节点元素
var city1=document.getElementById("city1");
//声明获取的城市节点元素
var area1=document.getElementById("area1");

function createcitys1(){
    for(var i in citys){
        //获取下拉列表集合实例
        var op=new Option(citys[i],citys[i]);
        //将下拉列表各元素添加到省份元素中
        city1.options.add(op);
    }
}

function createCities1(){
    //获取省份选中项的索引
    var index=city1.selectedIndex;
    //将area下的所有原有option移除
    area1.options.length=0;
    //添加对应城市下拉列表
    for(var i in cities[index]){
        var op=new Option(cities[index][i],cities[index][i]);
        area1.options.add(op);
    }
}