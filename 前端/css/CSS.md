### 1.简介

#### 1.1什么是CSS?

**[CSS]()** (层叠样式表Cascading Style Sheet) :[美化网页]()

在 [HTML概述]() 模块我们学习了HTML是什么，以及如何使用它来组成页面。 浏览器能够解析这些页面。标题部分看起来会比正常文本更大，段落则会另起一行，并且相互之间会有一定间隔。链接通过下划线和不同的颜色与其他文本区分开来。这些都是浏览器的默认样式——当开发者没有指定样式时，浏览器通过这些最简单的样式使页面具有基本可读性。

如果所有网站都像上图那样，互联网就会非常枯燥。但是使用 CSS 就可以完全控制浏览器如何显示 HTML 元素，从而充分展示你喜欢的设计样式。

CSS 可以用于给文档添加样式 —— 比如改变标题和链接的[颜色]()及[大小]()。它也可用于创建布局 —— 比如将一个单列文本变成包含主要内容区域和存放相关信息的侧边栏区域的[布局]()。它甚至还可以用来做一些特效，比如[动画]()。

#### 1.2快速入门

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!--可以编写css的代码
    语法:
        选择器{
            声明1;
            声明2;
        }
    -->
    <!--引入css文件-->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<h1>我是标题</h1>

</body>
</html>
```

```css
h1{
    color: crimson;
}
```

优势:

1. 内容和表现分离
2. 网页结构表现统一,可以实现复用
3. 样式十分丰富

#### 1.3css导入方式

1. 行内样式:在标签元素中,编写一个style属性,编写样式即可

2. 内部样式:在html页面head标签下写选择器

3. 外部样式:在css文件中写,再引入到html

   ​		链接式:<link rel="stylesheet" href="css/style.css">

    [`link`]() 语句块里面，我们用属性 `rel`，让浏览器知道有 CSS 文档存在（所以需要遵守 CSS 样式的规定），并利用属性 `href` 指定，寻找 CSS 文件的位置。

   ​		导入式:略

优先级:优先级(或者可以理解为覆盖,从第一行开始执行,后面的样式会覆盖前面的样式)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <!--内部样式-->
    <style>
        h1{
            color: blue;
        }
    </style>

    <!--引入css文件-->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<!--优先级:就近原则-->
<!--行内样式:在标签元素中,编写一个style属性,编写样式即可-->
<h1 style="color: crimson">我是标题</h1>

</body>
</html>
```

### 2.选择器

#### 2.1基本选择器

**不遵循就近原则**

优先级:	id选择器>类选择器>标签选择器

1. **标签选择器**

   格式:	标签名{}

   特点:会选择会选择页面中所有的标签,但是相同的标签都只能用同一个样式

2. **类选择器**

   格式:	.类名{}

   特点:给标签归类,跨标签使用,相同的标签可以取不同的类(class)名,根据不同的类名用不同的样式

3. **Id选择器**

   格式;	#id名

   特点:	id必须全局唯一,精准定位某个元素,这个元素如果被类选择器修饰或标签选择器修饰,也可以覆盖

#### 2.2层次选择器

整个html页面可以看出一棵树并分层

![image-20211223152112303](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112231521356.png)

1. 后代选择器(某一层下的所有层中的标签)

   格式:	标签名 后代标签名{}

   ```html
   body p{
       background: #98661a;
   }
   body标签层下面的所有层中的p标签
   ```

2. 子选择器

   格式;	body>p{}

   ```
   body>p{
       background: #c41245;
   }
   body标签层下面一层标签中的p标签
   ```

3. 相邻兄弟选择器(同一层中,该选中元素下面的兄弟元素)

   格式:	.active + p{}

   ```
   .active + p{
       background: #07502f;
   }
   ```

4. 通用选择器(同一层中,该选中元素下面的所有兄弟元素)

   格式:	.active~p{}

   ```
   .active~p{
       background: #07502f;
   }
   ```

#### 2.3结构伪类选择器

```html
/*不使用类选择器和id选择器*?
<style>
    /*ul的第一个子元素*/
    ul li:first-child{
        background: #98661a;
    }

    /*ul的最后一个元素*/
    ul li:last-child{
        background: #07502f;
    }
    
    /*选择第一个p1:定位到父元素,选择选择父元素下的第(?)个子元素,并且是当前元素才有效,顺序*/
    p:nth-child(1){
        background: #07502f;
    }
    /*选择选择父元素下的p元素的第(?)个,并且是当前元素才有效,类型*/
    p:nth-of-type(1){
        background: #07502f;
    }
    
</style>
```

#### 2.4属性选择器

格式:

标签名[属性]{}
标签名[属性=属性值(正则)]{}
	=	是绝对等于
	*=	是包含
	^=	以什么开头
	$=	以什么结尾

```html
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <!--内部样式-->
    <style>
        .demo a{
            float: left;
            display: block;
            height: 50px;
            width: 50px;
            border-radius: 10px;
            background: #2700ff;
            text-align: center;
            color: gainsboro;
            text-decoration: none;
            margin-right: 5px;
            font: bold 20px/50px Arial;
        }


        a[id]{
            background: yellow;
        }
        a[class*="links"]{
            background: yellow;
        }
        /*选中href中以http开头的元素*/
        a[href^=http]{
            background: yellow;
        }
        /*以doc结尾的*/
        a[href$=doc]{
            background: yellow;
        }
    </style>
</head>
<body>
<p class="demo">
    <a href="http://www.baidu.com" class="links item first" id="first">1</a>
    <a href="http://www.baidu.com" class="links item active" target="_blank" title="test">2</a>
    <a href="../1.我的第一个css程序/index.html" class="links item">3</a>
    <a href="../2.导入方式/123.jpg" class="links item">4</a>
    <a href="../3.基本选择器/123.png" class="links item">5</a>
    <a href="abc" class="links itemt">6</a>
    <a href="/a.pdf" class="links itemt">7</a>
    <a href="/abc.pdf" class="links itemt">8</a>
    <a href="abc.doc" class="links itemt">9</a>
</p>
</body>
```

### 3.美化网页元素

**span标签**:	重点要突出的字,使用span套起来

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!--内部样式-->
    <style>
        #title{
            font-size: 20px;
        }
    </style>
</head>
<body>
欢迎学习<span id="title">java</span>
</body>
</html>
```

#### 3.1字体样式

font-family:字体样式
font-size:字体大小
font-weight:字体粗细(bold/lighter)
color:字体颜色

```html
<style>
    body{
        font-family: 楷体;
        font-size: 20px;
        color: #07502f;
        font-weight: bold;
    }
</style>
```

#### 3.2文本样式

- 字体颜色:	color:(单词blue/RGB 0-F 十六进制)
- 排版(居中,左,右):text-align = center
- 块高:height
- 行高:line-height  单行文字居中line-height的高度等于height
- 下划线:text-decoration: underline
- 中划线:text-decoration: line-through
- 上划线:text-decoration: overline
- 文本图片对齐:vertical:middle
- 去除下划线:text-decoration: none

#### 3.3超链接伪类

一般只记住a和a:hover

```html
<!--内部样式-->
<style>
    /*默认颜色*/
    a{
        text-decoration: none;
        color: #c41245;
    }
    /*鼠标悬停的状态*/
    a:hover{
        color: #98661a;
    }
    /*鼠标按住未释放时的状态*/
    a:active{
        color: #07502f;
    }
</style>

```

#### 3.4列表

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <!--引入css文件-->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div id="nav">
    <h2 class="title">全部商品分类</h2>
    <ul>
        <li><a href="#">图书</a>&nbsp;&nbsp;<a href="#">音响</a></li>
        <li><a href="#">电器</a>&nbsp;&nbsp;<a href="#">手机</a></li>
        <li><a href="#">电脑</a>&nbsp;&nbsp;<a href="#">办公</a></li>
        <li><a href="#">家居</a>&nbsp;&nbsp;<a href="#">家装</a></li>
        <li><a href="#">服饰</a>&nbsp;&nbsp;<a href="#">化妆</a></li>
        <li><a href="#">礼品</a>&nbsp;&nbsp;<a href="#">钟表</a></li>
        <li><a href="#">食品</a>&nbsp;&nbsp;<a href="#">保健</a></li>
    </ul>
</div>
</body>
</html>
```

```css
#nav{
    width:200px;
    background: #89ca78;
}

.title{
    /*大小*/
    font-size: 20px;
    /*变粗*/
    font-weight: bold;
    /*缩进*/
    text-indent: 2em;
    background: #98661a;
    background-image: url("../resources/arrow-down.png");
    background-size: 20px 20px;
    background-repeat: no-repeat;
    background-position: 180px 5px;
}

/*ul{*/
/*    !*列表背景*!*/
/*    background: #83827e;*/
/*}*/

ul li{
    /*行高*/
    height: 30px;
    /*去掉无序列表前面的点,有序列表前面的数字
    none:去掉
    circle:空心圆
    decimal:数字
    square:正方形
    */
    list-style: none;
    background-image: url("../resources/arrow-right.png");
    background-size: 20px 20px;
    background-repeat: no-repeat;
    background-position: 140px 1px;
}

a{
    /*去掉下划线*/
    text-decoration: none;
    /*字体大小*/
    font-size: 14px;
    /*字体颜色*/
    color: #07502f;
}
a:hover{
    color: orange;
}
```

![image-20211223214705687](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112232147738.png)

#### 3.5背景

```css
div{
    /*宽*/
    width: 1000px;
    /*高*/
    height: 800px;
    /*边框*/
    border: 1px solid red;
    /*背景图片:默认全部平铺*/
    background-image: url("../resources/兔兔.jpg");
}
.div1{
    /*水平平铺*/
    background-repeat: repeat-x;
}
.div2{
    /*竖着平铺*/
    background-repeat: repeat-y;
}
.div3{
    /*不平铺*/
    background-repeat: no-repeat;
}
```

#### 3.6渐变

> 推荐网站:https://www.grabient.com/

```
background-color: #8EC5FC;
background-image: linear-gradient(62deg, #8EC5FC 0%, #E0C3FC 100%);
```

### 4.盒子模型

#### 4.1什么是盒子模型

![image-20211224150520254](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112241505401.png)

盒子的计算方式:一个元素到底多大?	在页面所占面积不只是算内容宽度

**页面所占面积位置=margin+border+padding+内容宽度**

#### 4.2边框和边距

margin:外边距

padding:内边距

border:边框

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>

    <!--引入css文件-->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div id="box">
    <h2>会员登录</h2>
    <form action="#">
        <div>
            <span>姓名:</span>
            <input type="text" placeholder="请输入姓名"></input>
        </div>
        <div>
            <span>密码:</span>
            <input type="password" placeholder="请输入年龄"></input>
        </div>
        <div>
            <span>邮箱:</span>
            <input type="text" placeholder="请输入邮箱"></input>
        </div>
        
    </form>
</div>

</body>
</html>
```

```css
body{
    /* margin:外边距 */
    margin: 0;
    /* 内边距*/
    padding: 1 1 1 1;
}
#box{
    width: 300px;
    /* border边框:线的粗细,线的样式(实体/虚线),线的颜色 */
    border: 1px solid rgb(32, 26, 26);
    background-color: rosybrown;
}
div:nth-of-type(1) input{
    background-color: silver;
    padding: 2px;
}
div:nth-of-type(1){
    padding: 10px;
}
```

网页效果

![image-20211224154657817](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112241546915.png)

#### 4.4圆角边框

```css
div{
    /*正方形*/
    /*width: 100px;*/
    /*height: 100px;*/
    /*border: 10px solid royalblue;*/
    /*圆形    圆圈:圆角=banjing*/
    /*width: 100px;*/
    /*height: 100px;*/
    /*border: 10px solid royalblue;*/
    /*border-radius: 50px;*/

    /*半圆*/
    width: 100px;
    height: 50px;
    margin: 30px;
    border: solid royalblue;
    border-radius: 50px 50px 0px 0px ;

}
img{
     width: 80px;
     height: 80px;
     border-radius: 40px;
 }
```

![image-20211224163855222](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112241638270.png)

#### 4.5阴影

```css
img{
    width: 50px;
    height: 50px;
    border-radius: 50px;
    /*阴影*/
    box-shadow: 0px 0px 50px yellow;
}
```

![image-20211224171528997](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112241715044.png)

### 5.浮动

块级元素:独占一行

```
h1-h6	p	div	列表
```

行内元素:不独占一行

```
span	a	img	strong...
```

行内元素可以被包含在块级元素中,反之不行

#### 5.1display

可以操控元素,但是不能控制方向

```html
<body>
<div class="div1">div元素</div>
<span>span标签</span>
<div>
    <ul>
    <li>1</li>
    <li>2</li>
    <li>3</li>
    <li>4</li>
</ul>
</div>
</body>
```

```css
.div1{
    width: 100px;
    height: 100px;
    border: 3px solid burlywood;
    /* inline:变成行元素 */
    display: inline;
}
span{
    width: 100px;
    height: 100px;
    border: 3px solid burlywood;
    /* block:变成块元素 */
    display: block;
}
ul li{

    /* inline-block:是块元素,但是可以行显示 */
    display: inline-block;
}
```

![image-20211224174458960](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112241744006.png)

#### 5.2float

可以操控元素,但是浮动后会出现超出父级边框的问题

```html
<body>
<div class="div">
    <div class="div1"><img src="resources/兔兔.jpg" width="100px" height="100px"></div>
    <div class="div2"><img src="resources/狗.jpg" width="100px" height="100px"></div>
    <div class="div3"><img src="resources/猫.jpg" width="100px" height="100px"></div>
    <div class="div4">浮动的盒子可以向左右浮动,直到它碰到包含框或另一个盒子为止</div>
</div>
</body>
```

```css
.div{
    margin: 10px;
    padding: 5px;
}
.div1{
    /* 设置边框 */
    border: 2px solid darkgreen;
    /* 设置浮动*/
    float: right;
}
.div2{
    border: 2px solid darkgreen;
    float: right;

}
.div3{
    border: 2px solid darkgreen;
    float: left;
}
.div4{
    border: 2px solid darkgreen;
    font-size: 12px;
    line-height: 23px;
}
```

#### 5.3父级边框塌陷问题

边框是被内容撑大的,内容浮动以后,边框变小了

```
/* clear:left   左侧不允许有浮动
   clear:right   右侧不允许有浮动
   clear:both   两侧不允许有浮动
   clear:none   不允许有浮动
*/
```

解决方案:

**1.增加父级元素的高度**

特点:简单,但是新增的元素又超出了父级的高度又会出问题

![image-20211224205908135](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112242059206.png)

```css
.div{
    margin: 10px;
    padding: 5px;
    height: 800px;
}
```

![image-20211224210015746](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112242100842.png)

**2.在下面浮动的元素下面增加一个空的div标签,清除浮动**

特点:简单,但是代码中尽量避免空div

```css
<div class="clear"></div>

.clear{
    clear: both;
    margin: 0;
    padding: 0;
}
```

![image-20211224210410644](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112242104717.png)

**3.overflow**

特点:简单,但是会有下拉

```css
/* 在父级元素中增加一个overflow */
overflow: hidden;
```

**4.父类添加一个伪类:after**

特点:写法稍微复杂,但是没有副作用

```css
.div ::after{
    content: '';
    display: block;
    clear: both;
}
```

### 6.定位

#### 6.1相对定位

相对于原来的位置,进行指定的偏移

```css
top:-20px;
left:20px;
bottom:-10;
right:20px;
```

```css
#box{
    /*边框宽高*/
    width: 300px;
    height: 300px;
    /*内边距*/
    padding: 10px;
    /*边框*/
    border: 2px solid red;
}
a{
    /*宽高*/
    width: 100px;
    height: 100px;
    /*去下划线*/
    text-decoration: none;
    /*背景*/
    background-color: #c41245;
    /*行高*/
    line-height: 100px;
    text-align: center;
    color: white;
    display: block;
}
a:hover{
    /*变色*/
    background-color: #07502f;
}
a1{

}
.a2{
    /*移动右移200上移100*/
    position: relative;
    left: 200px;
    top: -100px;
}
.a3{

}
.a4{
    /*右移100上移200*/
    position: relative;
    left: 100px;
    top: -200px;
}
.a5{
    /*右移200 上移200*/
    position: relative;
    left: 200px;
    top: -200px;

}
```

![image-20211224222212653](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112242222709.png)

#### 6.2绝对定位

**position:absolute**

1.父级元素有定位,相对于父级元素定位

```css
#father{
    border: 2px solid seagreen;
    /*父级元素有定位*/
    position: relative;
}

#div1{
    border: 2px solid seagreen;
    background-color: skyblue;
    /* 相对定位:相对于自己原来的位置 */
    position: absolute;
    right: 30px;
}
```

![image-20211224223432884](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112242234957.png)

2.没有父级元素定位的前提下,相对于浏览器定位

![image-20211224223350336](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112242233407.png)

#### 6.3固定定位

position=fixed

#### 6.4z-index

opacity:透明度

```html
<body>
<div id="content">
    <ul>
        <li><img src="resources/兔兔.jpg" width="200px" height="200px"></li>
        <li class="tipTest">学习css</li>
        <li class="tipBg"></li>
        <li>时间:2021-12-25</li>
        <li>地点:重庆</li>
    </ul>
</div>
</body>
```

```css
ul,li{
    padding: 0px;
    margin: 0px;
    /*去原点*/
    list-style: none;
}

#content{
    width: 200px;
    padding: 0px;
    margin: 0px;
    /*字体*/
    font-size: 12px;
    /*行高*/
    line-height: 25px;
    overflow: hidden;
    border: 2px solid blue;
}

/*父级元素相对定位*/
#content ul{
    position: relative;
}

.tipTest,.tipBg{
    /*就是把两个li移到同一个位置,然后设置层级显示*/
    position: absolute;
    width: 200px;
    height: 25px;
    top: 175px;
}
.tipTest{
    color:red;
    /*设置层级,默认是0*/
    z-index: 999;
}
.tipBg{
    background-color: #07502f;
    /*背景透明度*/
    opacity: 0.5;
}
```

![image-20211225154801951](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112251549943.png)