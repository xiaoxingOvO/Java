### 简介

> 菜鸟文档
>
> https://www.runoob.com/html/html-tutorial.html

#### 什么是html?

[HTML]() (HyperText Markup Language) 不是一门编程语言，而是一种用来告知浏览器如何组织页面的**标记语言**。HTML 可复杂、可简单，一切取决于开发者。它由一系列的**元素（[elements]()）**组成，这些元素可以用来包围不同部分的内容，使其以某种方式呈现或者工作。

#### W3C

World Wide Web Consortium（万维网联盟），成立于1994年，Web技术领域最权威和具影响力的国家**中立性技术标准机构**

**W3C标准包括**

- 结构化标准语言（HTML、XML）
- 表现标准语言（CSS）
- 行为标准（DOM、ECMAScript）

#### html标签

- HTML 标签是由**尖括号**包围的关键词，比如 <html>
- HTML 标签通常是成对出现的，比如 <b> 和 </b>
- 标签对中的第一个标签是开始标签，第二个标签是结束标签
- 开始和结束标签也被称为开放标签和闭合标签

#### html元素

![image-20211222195337918](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112221953993.png)

这个元素的主要部分有：

1. **开始标签**（Opening tag）：包含元素的名称（本例为 p），被大于号、小于号所包围。表示元素从这里开始或者开始起作用 —— 在本例中即段落由此开始。
2. **结束标签**（Closing tag）：与开始标签相似，只是其在元素名之前包含了一个斜杠。这表示着元素的结尾 —— 在本例中即段落在此结束。初学者常常会犯忘记包含结束标签的错误，这可能会产生一些奇怪的结果。
3. **内容**（Content）：元素的内容，本例中就是所输入的文本本身。
4. **元素**（Element）：开始标签、结束标签与内容相结合，便是一个完整的元素。

#### 元素属性

元素也可以有属性（Attribute）：

![image-20211222195556968](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112221955011.png)

属性包含了关于元素的一些额外信息，这些信息本身不应显现在内容中。本例中，`class` 是属性名称，`editor-note` 是属性的值 。`class` 属性可为元素提供一个标识名称，以便进一步为元素指定样式或进行其他操作时使用。

属性应该包含：

1. 在属性与元素名称（或上一个属性，如果有超过一个属性的话）之间的空格符。
2. 属性的名称，并接上一个等号。
3. 由引号所包围的属性值。

#### 嵌套元素

也可以将一个元素置于其他元素之中 —— 称作**嵌套**。要表明猫咪非常暴躁，可以将 “暴躁” 用 [``](https://developer.mozilla.org/zh-CN/docs/Web/HTML/Element/strong) 元素包围，爆字将突出显示：

```html
<p>我的猫咪脾气<strong>暴躁</strong>:)</p>
```

必须保证元素嵌套次序正确：本例首先使用`p`标签，然后是`strong`标签，因此要先`strong`结束标签，最后再结束`p`标签。

#### 空元素

不包含任何内容的元素称为空元素。比如 [`img`]() 元素：

```html
<img src="images/firefox-icon.png" alt="测试图片">
```

本元素包含两个属性，但是并没有 `</img>` 结束标签，元素里也没有内容。这是因为图像元素不需要通过内容来产生效果，它的作用是向其所在的位置嵌入一个图像。

#### 行内元素

无论内容多少,该元素独占一行,例如P标签,h1-h6的标题标签

#### 块元素

内容撑开宽度,左右都是行内元素的可以排在一行(a,strong(粗体),em(斜体))

#### HTML文档解析

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>

</body>
</html>
```

- `<!DOCTYPE html>` — 文档类型。混沌初分，HTML 尚在襁褓（大约是 1991/92 年）之时，`DOCTYPE` 用来链接一些 HTML 编写守则，比如自动查错之类。`DOCTYPE` 在当今作用有限，仅用于保证文档正常读取。现在知道这些就足够了。
- `<html></html>` — `html`元素。该元素包含整个页面的内容，也称作根元素。
- `<head></head>` — `head`元素。该元素的内容对用户不可见，其中包含例如面向搜索引擎的搜索关键字（`keywords`）、页面描述、CSS 样式表和字符编码声明等。
- `<meta charset="utf-8">` — 该元素指定文档使用 UTF-8 字符编码 ，UTF-8 包括绝大多数人类已知语言的字符。基本上 UTF-8 可以处理任何文本内容，还可以避免以后出现某些问题，没有理由再选用其他编码。
- `<title></title>` — `title`元素。该元素设置页面的标题，显示在浏览器标签页上，也作为收藏网页的描述文字。
- `<body></body>` — `body` 元素。该元素包含期望让用户在访问页面时看到的内容，包括文本、图像、视频、游戏、可播放的音轨或其他内容。

### 基本标签

##### 标题标签

标题元素可用于指定内容的标题和子标题。就像一本书的书名、每章的大标题、小标题，等。HTML 文档也是一样。请确保将 HTML 标题 标签只用于标题。不要仅仅是为了生成**粗体**或**大号**的文本而使用标题。

```html
<h1>一级标签</h1>
<h2>二级标签</h2>
<h3>三级标签</h3>
<h4>四级标签</h4>
<h5>五级标签</h5>
<h6>六级标签</h6>
```

##### 段落标签

p标签用来指定段落

```html
<p>第一段落</p>
<p>第二段落</p>
<p>第三段落</p>
```

##### 换行标签

```
第一行<br>
第二行<br>
```

##### 水平线标签

```html
<hr>
```

##### 字体样式标签

```html
<strong>粗体</strong>
<em>斜体</em>
```

##### 注释和特殊符号

可以将注释插入 HTML 代码中，这样可以提高其可读性，使代码更易被人理解。浏览器会忽略注释，也不会显示它们。

```html
<!-- 注释 -->
```

```html
<!--特殊符号 空格 版权符号 大于 小于-->
&nbsp;
&copy;
&gt;
&lt;
```

### 图像标签

../表示上一级目录

```html
<!--img
属性设置:
src(必填):图片地址
    相对路径(推荐使用),绝对路径
    ../跳到上一级
alt(必填):图片加载失败显示
title:鼠标悬停文字
width:宽
height;高
-->
<img src="../resources/兔兔.jpg" alt="图片"/>
```

### 链接标签

```html
<body>
<a id="top">顶部</a>
<!--a标签
href(必填):表示要跳转的地址,可以跳转到其他网页
target:表示窗口在哪里打开
        _blank:新标签打开
        _self:当前页面打开
中间可以写文,点击就跳转
也可以嵌套图片,点击就跳转
-->
<a href="1.我的第一个网页.html" target="_blank">点击我跳转</a>
<br>
<a href="1.我的第一个网页.html" target="_self">
    <img src="../resources/兔兔.jpg" alt="图片" title="悬停文字" width="300" height="300"/>
</a>
<br>

<!--锚链接-->
<a href="#top">回到顶部</a>
<!--跳转到其他页面的top位置-->
<a href="1.我的第一个网页.html#top"></a>

</body>
```

### 列表

1. **无序列表（Unordered List）**中项目的顺序并不重要。用一个 `ul` 元素包围。

2. **有序列表（Ordered List）**中项目的顺序很重要。用一个 `ol` 元素包围。

3. **自定义列表**:自定义列表不仅仅是一列项目，而是项目及其注释的组合。

   自定义列表以 <dl> 标签开始。每个自定义列表项以 <dt> 开始。每个自定义列表项的定义以 <dd> 开始。

```html
<!--有序列表-->
<ol>
    <li>有</li>
    <li>序</li>
    <li>列</li>
    <li>表</li>
</ol>

<!--无序列表-->
<ul>
    <li>无</li>
    <li>序</li>
    <li>列</li>
    <li>表</li>
</ul>

<!--自定义列表
    dl:标签
    dt:列表名称
    dd:列表内容
-->
<dl>
    <dt>咖啡</dt>
    <dd>产自中国</dd>
    <dd><a href="https://www.taobao.com/">点我购买更多</a></dd>
    <dt>茶</dt>
    <dd>产自长白山</dd>
</dl>
```

### 表格

表格由 <table> 标签来定义。每个表格均有若干行（由 <tr> 标签定义），每行被分割为若干单元格（由 <td> 标签定义）。字母 td 指表格数据（table data），即数据单元格的内容。数据单元格可以包含文本、图片、列表、段落、表单、水平线、表格等等。

```html
<!--表格table
tr:行
td:列
colspan="2"  跨列
rowspan="2"  跨行
-->
<table border="1">
    <tr>
        <td colspan="2">row 1-1</td>
        <td rowspan="2">row 1-3</td>
    </tr>
    <tr>
        <td>row 2-1</td>
        <td>row 2-2</td>
    </tr>
</table>
```

### 媒体元素

```html
<!--视频
src:视频地址
controls:控制按钮
autoplay:自动播放
-->
<video src="../video/倒计时.mp4" controls autoplay></video>
<audio src="../audio/两只老虎.mp3" controls autoplay></audio>
```

### 页面结构分析

header:标记头部区域内容(用于页面或页面中的一块区域)

footer:标记脚步区域的内容(用于整个页面或页面的一块区域)

section:Web页面中的一块独立区域

article:独立的文章内容

aside:相关内容或应用(常用于侧边栏)

nav:导航类辅助内容

### iframe内联框架

可以定义一个框架,然后跳转到这个框架显示

```html
<!--iframe
src:引用页面
name:框架标识名
-->
<iframe src="" frameborder="0" name="视频" width="800" height="600"></iframe>
<a href="7.媒体.html" target="视频">点击跳转</a>
```

### 表单

readonly只读

disabled禁用

hidden隐藏(通过隐藏域传一些默认值)

```html
<body>

<h1>注册</h1>

<!--表单form
action:表单提交的位置,可以是网站,可以是一个请求处理地址
method:post,get提交方式

 value="默认值"
 maxlength="8"  最多能写几个字符
 size:文本框的长度
 readonly:只读
 disabled禁用
hidden隐藏(通过隐藏域传一些默认值)
placeholder:提示信息(只能在输入框中用)
required:非空判断
pattern:正则表达式
-->
<form action="1.我的第一个网页.html" method="post">
    <!--文本框-->
    <p>
        <!--增强鼠标可用性-->
        <label for="name">名字:</label>
        <input type="text" id="name" name="username" placeholder="请输入用户名" required/>

    </p>
    <p>
        <label for="pw">密码:</label>
        <input type="password" id="pw" name="password"/>

    </p>
    <!--单选框-->
    <p>
        性别
        <input type="radio" value="boy" name="sex" checked/>
        <input type="radio" value="girl" name="sex"/>
    </p>
    <!--多选框-->
    <p>
        多选框
        <input type="checkbox" value="sleep" name="hobby"/>睡觉
        <input type="checkbox" value="code" name="hobby" checked/>代码
        <input type="checkbox" value="chat" name="hobby"/>聊天
        <input type="checkbox" value="game" name="hobby"/>游戏
    </p>
    <!--按钮-->
    <p>
        按钮
        <input type="button" name="btn1" value="点击变长"/>
        <input type="image" src="../resources/兔兔.jpg" width="50" height="50"/>
    </p>
    <!--下拉框,列表框-->
    <p>
        国家下拉框
        <select name="列表名称">
            <option value="选项的值" selected>中国</option>
            <option value="选项的值">美国</option>
            <option value="选项的值">瑞士</option>
            <option value="选项的值">法国</option>
        </select>
    </p>
    <!--文本域-->
    <p>
        简介
        <textarea name="textarea" cols="20" rows="10">文本内容</textarea>
    </p>
    <!--文件域-->
    <p>
        <input type="file" name="file"/>
    </p>
    <!--邮件-->
    <p>
        邮箱
        <input type="email" name="email"/>
    </p>
    <!--自定义邮箱-->
    <p>
        邮箱
        <input type="email" name="diyemail" pattern="/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
/^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/或\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"/>
    </p>
    <!--URL-->
    <p>
        URL
        <input type="url" name="url"/>
    </p>
    <!--数字-->
    <p>
        商品数量
        <input type="number" name="num" max="10" min="0" step="1"/>
    </p>
    <!--滑块-->
    <p>
        滑块
        <input type="range" name="voice" max="100" min="0" step="1"/>
    </p>
    <!--搜索框-->
    <p>
        搜索
        <input type="search" name="search"/>
    </p>
    <p>
        <input type="submit" name="提交"/>
        <input type="reset" name="重置">
    </p>
</form>
</body>
```

### 表单初级验证

```html
placeholder:提示信息(只能在输入框中用)
required:非空判断
pattern:正则表达式
```

### 总结

![image-20211223133355766](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112231334764.png)