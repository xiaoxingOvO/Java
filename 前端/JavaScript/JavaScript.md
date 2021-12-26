JavaScript

### 1.简介

**基础3件套**

1. **HTML** 定义了网页的内容
2. **CSS** 描述了网页的布局
3. **JavaScript** 控制了网页的行为

**1.1什么是JavaScript?**

JavaScript 是互联网上最流行的脚本语言，这门语言可用于 HTML 和 web

JavaScript 是一种轻量级的编程语言。

JavaScript 是可插入 HTML 页面的编程代码。

JavaScript 插入 HTML 页面后，可由所有的现代浏览器执行。

### 2.快速入门

#### 引入JavaScript

引入方法

1.内部标签

```html
<script>
    alert('hello world!')
</script>
```

2.外部引入

```html
<!--引入-->
<!--script标签必须成对-->
<script src="js/1.js"></script>
```

#### 输出

1. 使用 **window.alert()** 弹出警告框。
2. 使用 **document.write()** 方法将内容写到 HTML 文档中。
3. 使用 **innerHTML** 写入到 HTML 元素。
4. 使用 **console.log()** 写入到浏览器的控制台。

```html
<p id="test">JS输出方式</p>
<script>
    window.alert(1+2);
    document.write(Date())
    document.getElementById("test").innerText="JavaScript输出方式";
    console.log("JavaScript输出方式")
</script>
```

#### 语法

1. JavaScript 使用关键字 **var** 来定义变量， 使用等号来为变量赋值
2. JavaScript 对大小写是敏感的
3. 分号用于分隔 JavaScript 语句,通常我们在每条可执行的语句结尾添加分号。
4. JavaScript 会忽略多余的空格。您可以向脚本添加空格，来提高其可读性。
5. 可以在文本字符串中使用反斜杠对代码行进行换行。
6. 注释:  单行注释 **//**,  多行注释   /\* 注释内容 */
7. 变量必须以字母开头,也能以 $ 和 _ 符号开头（不过我们不推荐这么做）

#### 语句标识符

| 语句         | 描述                                                         |
| :----------- | :----------------------------------------------------------- |
| break        | 用于跳出循环。                                               |
| catch        | 语句块，在 try 语句块执行出错时执行 catch 语句块。           |
| continue     | 跳过循环中的一个迭代。                                       |
| do ... while | 执行一个语句块，在条件语句为 true 时继续执行该语句块。       |
| for          | 在条件语句为 true 时，可以将代码块执行指定的次数。           |
| for ... in   | 用于遍历数组或者对象的属性（对数组或者对象的属性进行循环操作）。 |
| function     | 定义一个函数                                                 |
| if ... else  | 用于基于不同的条件来执行不同的动作。                         |
| return       | 退出函数                                                     |
| switch       | 用于基于不同的条件来执行不同的动作。                         |
| throw        | 抛出（生成）错误 。                                          |
| try          | 实现错误处理，与 catch 一同使用。                            |
| var          | 声明一个变量。                                               |
| while        | 当条件语句为 true 时，执行语句块。                           |

#### 数据类型

**值类型(基本类型)**：字符串（String）、数字(Number)、布尔(Boolean)、对空（Null）、未定义（Undefined）、Symbol。

**引用数据类型**：对象(Object)、数组(Array)、函数(Function)。

```hrml
var length = 16;                                  // Number 通过数字字面量赋值
var points = x * 10;                              // Number 通过表达式字面量赋值
var lastName = "Johnson";                         // String 通过字符串字面量赋值
var cars = ["Saab", "Volvo", "BMW"];              // Array  通过数组字面量赋值
var person = {firstName:"John", lastName:"Doe"};  // Object 通过对象字面量赋值
```

#### 函数

语法: 

- JavaScript 对大小写敏感。关键词 function 必须是小写的，并且必须以与函数名称相同的大小写来调用函数。
- 变量和参数必须以一致的顺序出现。
- 使用 return 语句时，函数会停止执行，并返回指定的值。整个 JavaScript 并不会停止执行，仅仅是函数。JavaScript 将继续执行代码，从调用函数的地方。

```html
function functionname()
{
    // 执行代码
}

//带参数的
function myFunction(var1,var2)
{
代码
}

//返回值用return
function myFunction()
{
    var x=5;
    return x;
}
```

#### 作用域

**局部变量：**

只能在函数内部访问。

局部变量在函数开始执行时创建，函数执行完后局部变量会自动销毁。

**全局变量:**

网页中所有脚本和函数均可使用。

如果变量在函数内没有声明（没有使用 var 关键字），该变量为全局变量。

全局变量在页面关闭后销毁。

#### 事件

事件可以用于处理表单验证，用户输入，用户行为及浏览器动作

多种方法来执行 JavaScript 事件代码:

- HTML 事件属性可以直接执行 JavaScript 代码
- HTML 事件属性可以调用 JavaScript 函数

```html
//示例
<p id="time">2012</p>
<button onclick="getElementById('time').innerHTML=Date()">刷新时间</button>
```

#### 字符串

字符串可以是插入到引号中的任何字符。可以使用单引号或双引号

但是符号嵌套时,要记得使用转义字符

**字符串可以是对象**

通常， JavaScript 字符串是原始值，可以使用字符创建： **var firstName = "John"**

但我们也可以使用 new 关键字将字符串定义为一个对象： **var firstName = new String("John")**

**特殊字符**

转义字符 (\) 可以用于转义撇号，换行，引号，等其他特殊字符。

| 代码 | 输出        |
| :--- | :---------- |
| \'   | 单引号      |
| \"   | 双引号      |
| \\   | 反斜杠      |
| \n   | 换行        |
| \r   | 回车        |
| \t   | tab(制表符) |
| \b   | 退格符      |
| \f   | 换页符      |

**事件列表**

| 事件        | 描述                                 |
| :---------- | :----------------------------------- |
| onchange    | HTML 元素改变                        |
| onclick     | 用户点击 HTML 元素                   |
| onmouseover | 鼠标指针移动到指定的元素上时发生     |
| onmouseout  | 用户从一个 HTML 元素上移开鼠标时发生 |
| onkeydown   | 用户按下键盘按键                     |
| onload      | 浏览器已完成页面的加载               |

**字符串属性**

| 属性        | 描述                       |
| :---------- | :------------------------- |
| constructor | 返回创建字符串属性的函数   |
| length      | 返回字符串的长度           |
| prototype   | 允许您向对象添加属性和方法 |

**字符串方法**

| 方法                | 描述                                                         |
| :------------------ | :----------------------------------------------------------- |
| charAt()            | 返回指定索引位置的字符                                       |
| charCodeAt()        | 返回指定索引位置字符的 Unicode 值                            |
| concat()            | 连接两个或多个字符串，返回连接后的字符串                     |
| fromCharCode()      | 将 Unicode 转换为字符串                                      |
| indexOf()           | 返回字符串中检索指定字符第一次出现的位置                     |
| lastIndexOf()       | 返回字符串中检索指定字符最后一次出现的位置                   |
| localeCompare()     | 用本地特定的顺序来比较两个字符串                             |
| match()             | 找到一个或多个正则表达式的匹配                               |
| replace()           | 替换与正则表达式匹配的子串                                   |
| search()            | 检索与正则表达式相匹配的值                                   |
| slice()             | 提取字符串的片断，并在新的字符串中返回被提取的部分           |
| split()             | 把字符串分割为子字符串数组                                   |
| substr()            | 从起始索引号提取字符串中指定数目的字符                       |
| substring()         | 提取字符串中两个指定的索引号之间的字符                       |
| toLocaleLowerCase() | 根据主机的语言环境把字符串转换为小写，只有几种语言（如土耳其语）具有地方特有的大小写映射 |
| toLocaleUpperCase() | 根据主机的语言环境把字符串转换为大写，只有几种语言（如土耳其语）具有地方特有的大小写映射 |
| toLowerCase()       | 把字符串转换为小写                                           |
| toString()          | 返回字符串对象值                                             |
| toUpperCase()       | 把字符串转换为大写                                           |
| trim()              | 移除字符串首尾空白                                           |
| valueOf()           | 返回某个字符串对象的原始值                                   |



#### 运算符

**算术运算符**

| 运算符 | 描述         |
| :----- | :----------- |
| +      | 加法         |
| -      | 减法         |
| *      | 乘法         |
| /      | 除法         |
| %      | 取模（余数） |
| ++     | 自增         |
| --     | 自减         |

**复制运算符**

| 运算符 | 例子 | 等同于 |
| :----- | :--- | :----- |
| =      | x=y  |        |
| +=     | x+=y | x=x+y  |
| -=     | x-=y | x=x-y  |
| *=     | x*=y | x=x*y  |
| /=     | x/=y | x=x/y  |
| %=     | x%=y | x=x%y  |

**比较运算符**

| 运算符 | 描述                                               |
| :----- | :------------------------------------------------- |
| ==     | 等于                                               |
| x==5   | *true*                                             |
| ===    | 绝对等于（值和类型均相等）                         |
| x===5  | *true*                                             |
| !=     | 不等于                                             |
| !==    | 不绝对等于（值和类型有一个不相等，或两个都不相等） |
| x!==5  | *false*                                            |
| >      | 大于                                               |
| <      | 小于                                               |
| >=     | 大于或等于                                         |
| <=     | 小于或等于                                         |

**条件运算符**

语法:*variablename*=(*condition*)?*value1*:*value2* 

#### 条件语句

1. **if 语句** - 只有当指定条件为 true 时，使用该语句来执行代码
2. **if...else 语句** - 当条件为 true 时执行代码，当条件为 false 时执行其他代码
3. **if...else if....else 语句**- 使用该语句来选择多个代码块之一来执行
4. **switch 语句** - 使用该语句来选择多个代码块之一来执行

#### switch语句

工作原理：首先设置表达式 *n*（通常是一个变量）。随后表达式的值会与结构中的每个 case 的值做比较。如果存在匹配，则与该 case 关联的代码块会被执行。

```html
switch(n)
{
    case 1:
        执行代码块 1
        break;
    case 2:
        执行代码块 2
        break;
    default:
        与 case 1 和 case 2 不同时执行的代码
}
```

#### for循环

循环可以将代码块执行指定的次数

JavaScript 支持不同类型的循环：

- **for** - 循环代码块一定的次数
- **for/in** - 循环遍历对象的属性
- **while** - 当指定的条件为 true 时循环指定的代码块
- **do/while** - 同样当指定的条件为 true 时循环指定的代码块

#### while循环

只要指定条件为 true，循环就可以一直执行代码块。

**语法**

```
while (*条件*)
{
  *需要执行的代码*
}
```

**do/while 循环**

do/while 循环是 while 循环的变体。该循环会在检查条件是否为真之前执行一次代码块，然后如果条件为真的话，就会重复这个循环。

**语法**

```
do
{
  *需要执行的代码
*}
while (*条件*);
```

#### break和continue

break 语句用于跳出循环。

continue 用于跳过循环中的一个迭代。

#### typeof, null, 和 undefined

**typeof 操作符**

你可以使用 typeof 操作符来检测变量的数据类型。

 在JavaScript中，数组是一种特殊的对象类型。 因此 typeof [1,2,3,4] 返回 object。 

```
typeof "John"                // 返回 string
typeof 3.14                  // 返回 number
typeof false                 // 返回 boolean
typeof [1,2,3,4]             // 返回 object
typeof {name:'John', age:34} // 返回 object
```

> 注意:
>
> NaN 的数据类型是 number
>
> 数组(Array)的数据类型是 object
>
> 日期(Date)的数据类型为 object
>
> null 的数据类型是 object
>
> 未定义变量的数据类型为 undefined
>
> 如果对象是 JavaScript Array 或 JavaScript Date ，我们就无法通过 **typeof** 来判断他们的类型，因为都是 返回 object。

**null**

在 JavaScript 中 null 表示 "什么都没有"。

null是一个只有一个值的特殊类型。表示一个空对象引用。

```
var person = null;           // 值为 null(空), 但类型为对象
var person = undefined;     // 值为 undefined, 类型为 undefined
```

**undefined**

在 JavaScript 中, **undefined** 是一个没有设置值的变量。

**typeof** 一个没有值的变量会返回 **undefined**。

#### 类型转换

**JavaScript 数据类型**

在 JavaScript 中有 6 种不同的数据类型：

​		string	number	boolean	object	function	symbol

3 种对象类型：

​		Object	Date	Array

2 个不包含任何值的数据类型：

​		null	undefined

**constructor 属性**

**constructor** 属性返回所有 JavaScript 变量的构造函数。

```html
"John".constructor                 // 返回函数 String()  { [native code] }
(3.14).constructor                 // 返回函数 Number()  { [native code] }
false.constructor                  // 返回函数 Boolean() { [native code] }
[1,2,3,4].constructor              // 返回函数 Array()   { [native code] }
{name:'John', age:34}.constructor  // 返回函数 Object()  { [native code] }
new Date().constructor             // 返回函数 Date()    { [native code] }
function () {}.constructor         // 返回函数 Function(){ [native code] }
```

```
//可以使用 constructor 属性来查看对象是否为数组 (包含字符串 "Array"):
function isArray(myArray) {
    return myArray.constructor.toString().indexOf("Array") > -1;
}

//可以使用 constructor 属性来查看对象是否为日期 (包含字符串 "Date"):
function isDate(myDate) {
    return myDate.constructor.toString().indexOf("Date") > -1;
}
```

**类型转换**

JavaScript 变量可以转换为新变量或其他数据类型：

- 通过使用 JavaScript 函数
- 通过 JavaScript 自身自动转换

Number() 转换为数字， String() 转换为字符串， Boolean() 转换为布尔值。

使用不同的数值转换为数字(Number), 字符串(String), 布尔值(Boolean):

| 原始值              | 转换为数字 | 转换为字符串      | 转换为布尔值 |
| :------------------ | :--------- | :---------------- | :----------- |
| false               | 0          | "false"           | false        |
| true                | 1          | "true"            | true         |
| 0                   | 0          | "0"               | false        |
| 1                   | 1          | "1"               | true         |
| "0"                 | 0          | "0"               | true         |
| "000"               | 0          | "000"             | true         |
| "1"                 | 1          | "1"               | true         |
| NaN                 | NaN        | "NaN"             | false        |
| Infinity            | Infinity   | "Infinity"        | true         |
| -Infinity           | -Infinity  | "-Infinity"       | true         |
| ""                  | 0          | ""                | false        |
| "20"                | 20         | "20"              | true         |
| "Runoob"            | NaN        | "Runoob"          | true         |
| [ ]                 | 0          | ""                | true         |
| [20]                | 20         | "20"              | true         |
| [10,20]             | NaN        | "10,20"           | true         |
| ["Runoob"]          | NaN        | "Runoob"          | true         |
| ["Runoob","Google"] | NaN        | "Runoob,Google"   | true         |
| function(){}        | NaN        | "function(){}"    | true         |
| { }                 | NaN        | "[object Object]" | true         |
| null                | 0          | "null"            | false        |
| undefined           | NaN        | "undefined"       | false        |

#### 错误 - throw、try 和 catch

**try** 语句测试代码块的错误。

**catch** 语句处理错误。

**throw** 语句创建自定义错误。

**finally** 语句在 try 和 catch 语句之后，无论是否有触发异常，该语句都会执行。

#### 表单验证

JavaScript 可用来在数据被送往服务器前对 HTML 表单中的这些输入数据进行验证。

表单数据经常需要使用 JavaScript 来验证其正确性：

- 验证表单数据是否为空？

- 验证输入是否是一个正确的email地址？

- 验证日期是否输入正确？

- 验证表单输入内容是否为数字型？

  ```html
  <script>
    function validateForm(){
      var x=document.forms["myForm"]["fname"].value;
      if (x==null || x==""){
        alert("姓必须填写");
        return false;
      }
    }
  </script>
  
  <form name="myForm" action="demo-form.php" onsubmit="return validateForm()" method="post">
    姓: <input type="text" name="fname">
    <input type="submit" value="提交">
  </form>
  ```

#### let 和 const

let 声明的变量只在 let 命令所在的代码块内有效。

const 声明一个只读的常量，一旦声明，常量的值就不能改变

#### map和set

```html
<script>
  'use strict';
  var names = ["tom","jack"];
  var scores = [100,90];

  var map = new Map([['tom',100],['jack',90]])
  name = map.get('tom')//通过key获得value
  map.set('admin',88);//新增或修改
  console.log(name)
    
  var set = new Set([3,2,1,2,1,2,3])//set可以去重
  set.add(4);
  set.delete(1)
</script>
```

遍历

```html
  var map = new Map([['tom',100],['jack',90]])
  for (let x of map) {
      console.log(x)
  }

  var set = new Set([3,2,1,2,1,2,3])//set可以去重
  for (const number of set) {
      console.log(number)
  }
```



### 3.JS函数

#### 函数的定义

JavaScript 使用关键字 **function** 定义函数。

1.函数声明定义

```html
function functionName(parameters) {
  执行的代码
}
```

2.函数表达式定义

```html
//函数表达式可以存储在变量中
var x = function (a, b) {return a * b};
```

在这种方式下，`function (x) { ... }`是一个匿名函数，它没有函数名。但是，这个匿名函数赋值给了变量`abs`，所以，通过变量`abs`就可以调用该函数。

#### 调用函数



```
var abs = function (x) {
    if (x >= 0) {
        return x;
    } else {
        return -x;
    }
};
//调用函数时，按顺序传入参数即可：
abs(10); // 返回10
abs(-9); // 返回9
//由于JavaScript允许传入任意个参数而不影响调用，因此传入的参数比定义的参数多也没有问题，虽然函数内部并不需要这些参数：
abs(10, 'blablabla'); // 返回10
abs(-9, 'haha', 'hehe', null); // 返回9
//传入的参数比定义的少也没有问题：
abs(); // 返回NaN

//此时abs(x)函数的参数x将收到undefined，计算结果为NaN。
//要避免收到undefined，可以对参数进行检查：
function abs(x) {
    if (typeof x ! == 'number') {
        throw 'Not a number';
    }
    if (x >= 0) {
        return x;
    } else {
        return -x;
    }
}
```



#### arguments

JavaScript还有一个免费赠送的关键字`arguments`，它只在函数内部起作用，并且永远指向当前函数的调用者传入的所有参数。

利用`arguments`，你可以获得调用者传入的所有参数。也就是说，即使函数不定义任何参数，还是可以拿到参数的值：

```javascript
function abs() {
    if (arguments.length === 0) {
        return 0;
    }
    var x = arguments[0];
    return x >= 0 ? x : -x;
}

abs(); // 0
abs(10); // 10
abs(-9); // 9
```

实际上`arguments`最常用于判断传入参数的个数。你可能会看到这样的写法：

```javascript
// foo(a[, b], c)
// 接收2~3个参数，b是可选参数，如果只传2个参数，b默认为null：
function foo(a, b, c) {
    if (arguments.length === 2) {
        // 实际拿到的参数是a和b，c为undefined
        c = b; // 把b赋给c
        b = null; // b变为默认值
    }
    // ...
}
//要把中间的参数b变为“可选”参数，就只能通过arguments判断，然后重新调整参数并赋值。
```

#### rest参数

```javascript
function foo(a, b, ...rest) {
    console.log('a = ' + a);
    console.log('b = ' + b);
    console.log(rest);
}
```

rest参数只能写在最后，前面用`...`标识，从运行结果可知，传入的参数先绑定`a`、`b`，多余的参数以数组形式交给变量`rest`，所以，不再需要`arguments`我们就获取了全部参数。

如果传入的参数连正常定义的参数都没填满，也不要紧，rest参数会接收一个空数组（注意不是`undefined`）。

#### 变量作用域

在JavaScript中，用`var`申明的变量实际上是有作用域的。

如果一个变量在函数体内部申明，则该变量的作用域为整个函数体，在函数体外不可引用该变量：

```javascript
'use strict';

function foo() {
    var x = 1;
    x = x + 1;
}

x = x + 2; // ReferenceError! 无法在函数体外引用变量x
```

如果两个不同的函数各自申明了同一个变量，那么该变量只在各自的函数体内起作用。换句话说，不同函数内部的同名变量互相独立，互不影响：

```javascript
'use strict';

function foo() {
    var x = 1;
    x = x + 1;
}

function bar() {
    var x = 'A';
    x = x + 'B';
}
```

由于JavaScript的函数可以嵌套，此时，内部函数可以访问外部函数定义的变量，反过来则不行：

```javascript
'use strict';

function foo() {
    var x = 1;
    function bar() {
        var y = x + 1; // bar可以访问foo的变量x!
    }
    var z = y + 1; // ReferenceError! foo不可以访问bar的变量y!
}
```

如果内部函数和外部函数的变量名重名

```javascript
function foo() {
    var x = 1;
    function bar() {
        var x = 'A';
        console.log('x in bar() = ' + x); // 'A'
    }
    console.log('x in foo() = ' + x); // 1
    bar();
}

foo();

//x in foo() = 1
//x in bar() = A
```

JavaScript的函数在查找变量时从自身函数定义开始，从“内”向“外”查找。如果内部函数定义了与外部函数重名的变量，则内部函数的变量将“屏蔽”外部函数的变量。

#### 解析赋值

从ES6开始，JavaScript引入了解构赋值，可以同时对一组变量进行赋值。

```javascript
var array = ['hello', 'JavaScript', 'ES6'];
var x = array[0];
var y = array[1];
var z = array[2];
//在ES6中，可以使用解构赋值，直接对多个变量同时赋值：
var [x, y, z] = ['hello', 'JavaScript', 'ES6'];


```

如果需要从一个对象中取出若干属性，也可以使用解构赋值，便于快速获取对象的指定属性：

```javascript
'use strict';

var person = {
    name: '小明',
    age: 20,
    gender: 'male',
    passport: 'G-12345678',
    school: 'No.4 middle school'
};
var {name, age, passport} = person;
```

使用场景

解构赋值在很多时候可以大大简化代码。例如，交换两个变量`x`和`y`的值，可以这么写，不再需要临时变量：

```
var x=1, y=2;
[x, y] = [y, x]
```

快速获取当前页面的域名和路径：

```
var {hostname:domain, pathname:path} = location;
```

#### 方法

在一个对象中绑定函数，称为这个对象的方法。

```javascript
var xiaoming = {
    name: '小明',
    birth: 1990,
    age: function () {
        var y = new Date().getFullYear();
        return y - this.birth;
    }
};

xiaoming.age; // function xiaoming.age()
xiaoming.age(); // 今年调用是25,明年调用就变成26了
```

绑定到对象上的函数称为方法，和普通函数也没啥区别，但是它在内部使用了一个`this`关键字，这个东东是什么？

在一个方法内部，`this`是一个特殊变量，它始终指向当前对象，也就是`xiaoming`这个变量。所以，`this.birth`可以拿到`xiaoming`的`birth`属性。

**apply**

虽然在一个独立的函数调用中，根据是否是strict模式，`this`指向`undefined`或`window`，不过，我们还是可以控制`this`的指向的！

要指定函数的`this`指向哪个对象，可以用函数本身的`apply`方法，它接收两个参数，第一个参数就是需要绑定的`this`变量，第二个参数是`Array`，表示函数本身的参数。

用`apply`修复`getAge()`调用：

```javascript
function getAge() {
    var y = new Date().getFullYear();
    return y - this.birth;
}

var xiaoming = {
    name: '小明',
    birth: 1990,
    age: getAge
};

xiaoming.age(); // 25
getAge.apply(xiaoming, []); // 25, this指向xiaoming, 参数为空
```

#### Date

在JavaScript中，`Date`对象用来表示日期和时间。

要获取系统当前时间，用：

```javascript
var now = new Date();
now; // Wed Jun 24 2015 19:49:22 GMT+0800 (CST)
now.getFullYear(); // 2015, 年份
now.getMonth(); // 5, 月份，注意月份范围是0~11，5表示六月
now.getDate(); // 24, 表示24号
now.getDay(); // 3, 表示星期三
now.getHours(); // 19, 24小时制
now.getMinutes(); // 49, 分钟
now.getSeconds(); // 22, 秒
now.getMilliseconds(); // 875, 毫秒数
now.getTime(); // 1435146562875, 以number形式表示的时间戳
```

注意，当前时间是浏览器从本机操作系统获取的时间，所以不一定准确，因为用户可以把当前时间设定为任何值。

> JavaScript的Date对象月份值从0开始，牢记0=1月，1=2月，2=3月，……，11=12月。

#### JSON

JSON是JavaScript Object Notation的缩写，它是一种数据交换格式。

并且，JSON还定死了字符集必须是UTF-8，表示多语言就没有问题了。为了统一解析，JSON的字符串规定必须用双引号`""`，Object的键也必须用双引号`""`。

**序列化**

```javascript
var xiaoming = {
    name: '小明',
    age: 14,
    gender: true,
    height: 1.65,
    grade: null,
    'middle-school': '\"W3C\" Middle School',
    skills: ['JavaScript', 'Java', 'Python', 'Lisp']
};
//把小明这个对象序列化成JSON格式的字符串
var s = JSON.stringify(xiaoming);
console.log(s);
//要输出得好看一些，可以加上参数，按缩进输出：
JSON.stringify(xiaoming, null, '  ');
//第二个参数用于控制如何筛选对象的键值，如果我们只想输出指定的属性，可以传入Array：
JSON.stringify(xiaoming, ['name', 'skills'], '  ');
//还可以传入一个函数，这样对象的每个键值对都会被函数先处理：
function convert(key, value) {
    if (typeof value === 'string') {
        //把所有属性值都变成大写：
        return value.toUpperCase();
    }
    return value;
}
JSON.stringify(xiaoming, convert, '  ');

//如果我们还想要精确控制如何序列化小明，可以给xiaoming定义一个toJSON()的方法，直接返回JSON应该序列化的数据：
var xiaoming = {
    name: '小明',
    age: 14,
    gender: true,
    height: 1.65,
    grade: null,
    'middle-school': '\"W3C\" Middle School',
    skills: ['JavaScript', 'Java', 'Python', 'Lisp'],
    toJSON: function () {
        return { // 只输出name和age，并且改变了key：
            'Name': this.name,
            'Age': this.age
        };
    }
};

JSON.stringify(xiaoming); // '{"Name":"小明","Age":14}'
```

**反序列化**

拿到一个JSON格式的字符串，我们直接用`JSON.parse()`把它变成一个JavaScript对象：

```
JSON.parse('{"name":"小明","age":14}');
// Object {name: '小明', age: 14}
```

#### Ajax

1. 原生的js写法 xhr异步请求
2. jQuery封装好的方法
3. axios请求

### 4.面向对象

面向对象的两个基本概念：

1. 类：类是对象的类型模板，例如，定义`Student`类来表示学生，类本身是一种类型，`Student`表示学生类型，但不表示任何具体的某个学生；
2. 实例：实例是根据类创建的对象，例如，根据`Student`类可以创建出`xiaoming`、`xiaohong`、`xiaojun`等多个实例，每个实例表示一个具体的学生，他们全都属于`Student`类型。

不过，在JavaScript中，这个概念需要改一改。JavaScript不区分类和实例的概念，而是通过原型（prototype）来实现面向对象编程。

JavaScript的原型链和Java的Class区别就在，它没有“Class”的概念，所有对象都是实例，所谓继承关系不过是把一个对象的原型指向另一个对象而已。

```javascript
/*原型是指当我们想要创建xiaoming这个具体的学生时，我们并没有一个Student类型可用。那怎么办？恰好有这么一个现成的对象*/
var Student = {
    name: 'Robot',
    height: 1.2,
    run: function () {
        console.log(this.name + ' is running...');
    }
};
//我们看这个robot对象有名字，有身高，还会跑，有点像小明，干脆就根据它来“创建”小明得了！
//于是我们把它改名为Student，然后创建出xiaoming：
var xiaoming = {
    name: '小明'
};
//这一行代码把xiaoming的原型指向了对象Student，看上去xiaoming仿佛是从Student继承下来的：
xiaoming.__proto__ = Student;
//输出
xiaoming.name; // '小明'
xiaoming.run(); // 小明 is running...
//xiaoming有自己的name属性，但并没有定义run()方法。不过，由于小明是从Student继承而来，只要Student有run()方法，xiaoming也可以调用：
```

#### 4.1创建对象

JavaScript对每个创建的对象都会设置一个原型，指向它的原型对象。

当我们用`obj.xxx`访问一个对象的属性时，JavaScript引擎先在当前对象上查找该属性，如果没有找到，就到其原型对象上找，如果还没有找到，就一直上溯到`Object.prototype`对象，最后，如果还没有找到，就只能返回`undefined`。

```javascript
<!--直接创建一个arr对象-->
var arr = [1, 2, 3];

/*通过构造函数的方法来创建对象。*/
function Student(name) {
    this.name = name;
    this.hello = function () {
        alert('Hello, ' + this.name + '!');
    }
}
var xiaoming = new Student('小明');
```

#### 4.2原型继承

```javascript
//Student构造函数：
function Student(props) {
    this.name = props.name || 'Unnamed';
}

Student.prototype.hello = function () {
    alert('Hello, ' + this.name + '!');
}
//基于Student扩展出PrimaryStudent，可以先定义出PrimaryStudent：
// PrimaryStudent构造函数:
function PrimaryStudent(props) {
    Student.call(this, props);
    this.grade = props.grade || 1;
}

// 空函数F:
function F() {
}

// 把F的原型指向Student.prototype:
F.prototype = Student.prototype;

// 把PrimaryStudent的原型指向一个新的F对象，F对象的原型正好指向Student.prototype:
PrimaryStudent.prototype = new F();

// 把PrimaryStudent原型的构造函数修复为PrimaryStudent:
PrimaryStudent.prototype.constructor = PrimaryStudent;

// 继续在PrimaryStudent原型（就是new F()对象）上定义方法：
PrimaryStudent.prototype.getGrade = function () {
    return this.grade;
};

// 创建xiaoming:
var xiaoming = new PrimaryStudent({
    name: '小明',
    grade: 2
});
xiaoming.name; // '小明'
xiaoming.grade; // 2

// 验证原型:
xiaoming.__proto__ === PrimaryStudent.prototype; // true
xiaoming.__proto__.__proto__ === Student.prototype; // true

// 验证继承关系:
xiaoming instanceof PrimaryStudent; // true
xiaoming instanceof Student; // true
```

注意，函数`F`仅用于桥接，我们仅创建了一个`new F()`实例，而且，没有改变原有的`Student`定义的原型链。

如果把继承这个动作用一个`inherits()`函数封装起来，还可以隐藏`F`的定义，并简化代码：

```javascript
function inherits(Child, Parent) {
    var F = function () {};
    F.prototype = Parent.prototype;
    Child.prototype = new F();
    Child.prototype.constructor = Child;
}
```

这个`inherits()`函数可以复用：

```javascript
function Student(props) {
    this.name = props.name || 'Unnamed';
}

Student.prototype.hello = function () {
    alert('Hello, ' + this.name + '!');
}

function PrimaryStudent(props) {
    Student.call(this, props);
    this.grade = props.grade || 1;
}

// 实现原型继承链:
inherits(PrimaryStudent, Student);

// 绑定其他方法到PrimaryStudent原型:
PrimaryStudent.prototype.getGrade = function () {
    return this.grade;
};
```

> ### 小结
>
> JavaScript的原型继承实现方式就是：
>
> 1. 定义新的构造函数，并在内部用`call()`调用希望“继承”的构造函数，并绑定`this`；
> 2. 借助中间函数`F`实现原型链继承，最好通过封装的`inherits`函数完成；
> 3. 继续在新的构造函数的原型上定义新方法。

#### 4.3class继承

JavaScript的对象模型是基于原型实现的，特点是简单，缺点是理解起来比传统的类－实例模型要困难，最大的缺点是继承的实现需要编写大量代码，并且需要正确实现原型链。

新的关键字`class`从ES6开始正式被引入到JavaScript中。`class`的目的就是让定义类更简单。

```javascript
<script>
    <!--函数实现Student的方法-->
    // function Student(name) {
    //     this.name = name;
    // }
    //
    // Student.prototype.hello = function () {
    //     alert('Hello, ' + this.name + '!');
    // }
    
    /*class关键字来编写Student，可以这样写：
    * class的定义包含了构造函数constructor和定义在原型对象上的函数hello()（注意没有function关键字）
    */
    class Student {
        constructor(name) {
            this.name = name;
        }

        hello() {
            alert('Hello, ' + this.name + '!');
        }
    }
    // 创建一个Student对象
    var xiaoming = new Student('小明');
    xiaoming.hello();
</script>
```

用`class`定义对象的另一个巨大的好处是继承更方便了,直接通过`extends`来实现：

```javascript
class PrimaryStudent extends Student {
    constructor(name, grade) {
        super(name); // 记得用super调用父类的构造方法!
        this.grade = grade;
    }

    myGrade() {
        alert('I am at grade ' + this.grade);
    }
}
```

> 注意`PrimaryStudent`的定义也是class关键字实现的，而`extends`则表示原型链对象来自`Student`。子类的构造函数可能会与父类不太相同，例如，`PrimaryStudent`需要`name`和`grade`两个参数，并且需要通过`super(name)`来调用父类的构造函数，否则父类的`name`属性无法正常初始化。
>
> `PrimaryStudent`已经自动获得了父类`Student`的`hello`方法，我们又在子类中定义了新的`myGrade`方法。

### 5.操作BOM对象

BOM:浏览器对象模型

JavaScript可以获取浏览器提供的很多对象，并进行操作。

#### window

`window`对象不但充当全局作用域，而且表示浏览器窗口。

`window`对象有`innerWidth`和`innerHeight`属性，可以获取浏览器窗口的内部宽度和高度。内部宽高是指除去菜单栏、工具栏、边框等占位元素后，用于显示网页的净宽高。

对应的，还有一个`outerWidth`和`outerHeight`属性，可以获取浏览器窗口的整个宽高。

```javascript
<script>

    'use strict'
    // 可以调整浏览器窗口大小试试:
    console.log(
        'window inner size: ' + window.innerWidth +
        ' x ' + window.innerHeight +
        'outer size:' + outerWidth +
        ' x ' + outerHeight);
</script>
```



#### navigator

`navigator`对象表示浏览器的信息，最常用的属性包括：

- navigator.appName：浏览器名称；
- navigator.appVersion：浏览器版本；
- navigator.language：浏览器设置的语言；
- navigator.platform：操作系统类型；
- navigator.userAgent：浏览器设定的`User-Agent`字符串。

```javascript
<script>
    'use strict'
    console.log('appName = ' + navigator.appName);
    console.log('appVersion = ' + navigator.appVersion);
    console.log('language = ' + navigator.language);
    console.log('platform = ' + navigator.platform);
    console.log('userAgent = ' + navigator.userAgent);
</script>
```

> *注意*，`navigator`的信息可以很容易地被用户修改，所以JavaScript读取的值不一定是正确的。很多初学者为了针对不同浏览器编写不同的代码，喜欢用`if`判断浏览器版本，例如：

```javascript
var width;
if (getIEVersion(navigator.userAgent) < 9) {
    width = document.body.clientWidth;
} else {
    width = window.innerWidth;
}
```

但这样既可能判断不准确，也很难维护代码。正确的方法是充分利用JavaScript对不存在属性返回`undefined`的特性，直接用短路运算符`||`计算：

```javascript
var width = window.innerWidth || document.body.clientWidth;
```

#### screen

`screen`对象表示屏幕的信息，常用的属性有：

- screen.width：屏幕宽度，以像素为单位；
- screen.height：屏幕高度，以像素为单位；
- screen.colorDepth：返回颜色位数，如8、16、24。

#### location

`location`对象表示当前页面的URL信息。例如，一个完整的URL：

可以用`location.href`获取。要获得URL各个部分的值，可以这么写：

```javascript
location.protocol; // 'http'
location.host; // 'www.example.com'
location.port; // '8080'
location.pathname; // '/path/index.html'
location.search; // '?a=1&b=2'
location.hash; // 'TOP'
```

要加载一个新页面，可以调用`location.assign()`。如果要重新加载当前页面，调用`location.reload()`方法非常方便

```javascript
if (confirm('重新加载当前页' + location.href + '?')) {
    location.reload();
} else {
    location.assign('/'); // 设置一个新的URL地址
}
```

#### document

`document`对象表示当前页面。由于HTML在浏览器中以DOM形式表示为树形结构，`document`对象就是整个DOM树的根节点。

> `document`的`title`属性是从HTML文档中的`<title>xxx</title>`读取的，但是可以动态改变：

```javascript
document.title = '努力学习JavaScript!';
```

要查找DOM树的某个节点，需要从`document`对象开始查找。最常用的查找是根据ID和Tag Name。

```html
<dl id="drink-menu" style="border:solid 1px #ccc;padding:6px;">
    <dt>摩卡</dt>
    <dd>热摩卡咖啡</dd>
    <dt>酸奶</dt>
    <dd>北京老酸奶</dd>
    <dt>果汁</dt>
    <dd>鲜榨苹果汁</dd>
</dl>
```

> 用`document`对象提供的`getElementById()`和`getElementsByTagName()`可以按ID获得一个DOM节点和按Tag名称获得一组DOM节点：

```javascript
var menu = document.getElementById('drink-menu');
var drinks = document.getElementsByTagName('dt');
var i, s;

s = '提供的饮料有:';
for (i=0; i<drinks.length; i++) {
    s = s + drinks[i].innerHTML + ',';
}
console.log(s);
```

> `document`对象还有一个`cookie`属性，可以获取当前页面的Cookie。

Cookie是由服务器发送的key-value标示符。因为HTTP协议是无状态的，但是服务器要区分到底是哪个用户发过来的请求，就可以用Cookie来区分。当一个用户成功登录后，服务器发送一个Cookie给浏览器，例如`user=ABC123XYZ(加密的字符串)...`，此后，浏览器访问该网站时，会在请求头附上这个Cookie，服务器根据Cookie即可区分出用户。

Cookie还可以存储网站的一些设置，例如，页面显示的语言等等。

JavaScript可以通过`document.cookie`读取到当前页面的Cookie：

```
document.cookie; // 'v=123; remember=true; prefer=zh'
```

#### history

`history`对象保存了浏览器的历史记录，JavaScript可以调用`history`对象的`back()`或`forward ()`，相当于用户点击了浏览器的“后退”或“前进”按钮。

这个对象属于历史遗留对象，对于现代Web页面来说，由于大量使用AJAX和页面交互，简单粗暴地调用`history.back()`可能会让用户感到非常愤怒。

新手开始设计Web页面时喜欢在登录页登录成功时调用`history.back()`，试图回到登录前的页面。这是一种错误的方法。任何情况，你都不应该使用`history`这个对象了。

### 6.操作DOM对象

DOM:文档对象模型

由于HTML文档被浏览器解析后就是一棵DOM树，要改变HTML的结构，就需要通过JavaScript来操作DOM。

操作一个DOM节点:

- 更新：更新该DOM节点的内容，相当于更新了该DOM节点表示的HTML的内容；
- 遍历：遍历该DOM节点下的子节点，以便进行进一步操作；
- 添加：在该DOM节点下新增一个子节点，相当于动态增加了一个HTML节点；
- 删除：将该节点从HTML中删除，相当于删掉了该DOM节点的内容以及它包含的所有子节点。

> 1.取到节点

在操作一个DOM节点前，我们需要通过各种方式先拿到这个DOM节点。最常用的方法是`document.getElementById()`和`document.getElementsByTagName()`，以及CSS选择器`document.getElementsByClassName()`。

由于ID在HTML文档中是唯一的，所以`document.getElementById()`可以直接定位唯一的一个DOM节点。`document.getElementsByTagName()`和`document.getElementsByClassName()`总是返回一组DOM节点。要精确地选择DOM，可以先定位父节点，再从父节点开始选择，以缩小范围。

```javascript
// 返回ID为'test'的节点：
var test = document.getElementById('test');

// 先定位ID为'test-table'的节点，再返回其内部所有tr节点：
var trs = document.getElementById('test-table').getElementsByTagName('tr');

// 先定位ID为'test-div'的节点，再返回其内部所有class包含red的节点：
var reds = document.getElementById('test-div').getElementsByClassName('red');

// 获取节点test下的所有直属子节点:
var cs = test.children;

// 获取节点test下第一个、最后一个子节点：
var first = test.firstElementChild;
var last = test.lastElementChild;
```

第二种方法是使用`querySelector()`和`querySelectorAll()`，需要了解selector语法，然后使用条件来获取节点，更加方便：

```javascript
// 通过querySelector获取ID为q1的节点：
var q1 = document.querySelector('#q1');

// 通过querySelectorAll获取q1节点内的符合条件的所有节点：
var ps = q1.querySelectorAll('div.highlighted > p');
```

#### 6.1更新DOM

> 修改节点的文本

方法有两种：

一种是修改`innerHTML`属性，这个方式非常强大，不但可以修改一个DOM节点的文本内容，还可以直接通过HTML片段修改DOM节点内部的子树：

另一种是`innerText`

> 修改CSS

DOM节点的`style`属性对应所有的CSS，可以直接获取或设置。因为CSS允许`font-size`这样的名称，但它并非JavaScript有效的属性名，所以需要在JavaScript中改写为驼峰式命名`fontSize`：

```javascript
<script>
    var id1 = document.getElementById('div');

    //方式一:innerText
    id1.innerText = '这是通过innerText修改的'

    //方式二:innerHTML
    // id1.innerHTML = '<span style="color:red">这是通过innerHTML修改的</span>'

    //修改css
    id1.style.color = 'green';
    id1.style.fontSize = '20px';
</script>
```

#### 6.2插入DOM

如果这个DOM节点是空的，例如，`<div></div>`，那么，直接使用`innerHTML = '<span>child</span>'`就可以修改DOM节点的内容，相当于“插入”了新的DOM节点。

如果这个DOM节点不是空的，那就不能这么做，因为`innerHTML`会直接替换掉原来的所有子节点。

> 两个办法可以插入新的节点。

一个是使用`appendChild`，把一个子节点添加到父节点的最后一个子节点。例如：

```html
<!-- HTML结构 -->
<p id="js">JavaScript</p>
<div id="list">
    <p id="java">Java</p>
    <p id="python">Python</p>
    <p id="scheme">Scheme</p>
</div>
```

```javascript
//把<p id="js">JavaScript</p>添加到<div id="list">的最后一项：
var
    js = document.getElementById('js'),
    list = document.getElementById('list');
list.appendChild(js);
```

```html
//现在，HTML结构变成了这样：
<!-- HTML结构 -->
<div id="list">
    <p id="java">Java</p>
    <p id="python">Python</p>
    <p id="scheme">Scheme</p>
    <p id="js">JavaScript</p>
</div>
```

> 因为我们插入的`js`节点已经存在于当前的文档树，因此这个节点首先会从原先的位置删除，再插入到新的位置。

更多的时候我们会从零创建一个新的节点，然后插入到指定位置：

```html
<p id="js">JavaScript</p>
<div id="list">
  <p id="java">Java</p>
  <p id="python">Python</p>
  <p id="scheme">Scheme</p>
</div>

<script>      
    var
        js = document.getElementById('js'),
        list = document.getElementById('list');
    list.appendChild(js);
    //我们插入的js节点已经存在于当前的文档树，因此这个节点首先会从原先的位置删除，再插入到新的位置。

    //通过js创建一个新的节点
    var newP = document.createElement('p');
    newP.id = 'newP'
    newP.innerText = 'Hello';
    list.appendChild(newP);

    //创建一个标签节点
    var scriptElement = document.createElement('script');
    scriptElement.setAttribute('type','text/javascript')

    //getElementsByTagName返回的是个集合
    var bodyElem = document.getElementsByTagName('body');
    bodyElem[0].style.backgroundColor = 'yellow'

</script>
```

> 使用

动态创建一个节点然后添加到DOM树中，可以实现很多功能。举个例子，下面的代码动态创建了一个`<style>`节点，然后把它添加到`<head>`节点的末尾，这样就动态地给文档添加了新的CSS定义：

```javascript
var d = document.createElement('style');
d.setAttribute('type', 'text/css');
d.innerHTML = 'p { color: red }';
document.getElementsByTagName('head')[0].appendChild(d);
```

**insertBefore**

如果我们要把子节点插入到指定的位置怎么办？可以使用`parentElement.insertBefore(newElement, referenceElement);`，子节点会插入到`referenceElement`之前。

```javascript
    //通过js创建一个新的节点
    var newP = document.createElement('p');
    newP.id = 'newP'
    newP.innerText = 'Hello';
    
    //插入到末尾
    //list.appendChild(newP);
    
    //插入到指定元素前面
    list.insertBefore(newP,java)
```



#### 6.3删除DOM

要删除一个节点，首先要获得该节点本身以及它的父节点，然后，调用父节点的`removeChild`把自己删掉：

```
<script>
    var p1 = document.getElementById("js");
    var p2 = document.getElementById("java");
    var p3 = document.getElementById("python");
    var p4 = document.getElementById("scheme");

    //获取父节点
    var d = document.getElementById("list")
    //通过父节点删除子节点
    d.removeChild(p4);
    
   
    //通过子节点获取父节点,然后再删除
    var father  = p4.parentElement;
    father.removeChild(p4);

</script>
```

当你遍历一个父节点的子节点并进行删除操作时，要注意，`children`属性是一个只读属性，并且它在子节点变化时会实时更新。

```javascript
//例如，对于如下HTML结构：

<div id="parent">
    <p>First</p>
    <p>Second</p>
</div>

//当我们用如下代码删除子节点时：
var parent = document.getElementById('parent');
parent.removeChild(parent.children[0]);
parent.removeChild(parent.children[1]); // <-- 浏览器报错
```

浏览器报错：`parent.children[1]`不是一个有效的节点。原因就在于，当`<p>First</p>`节点被删除后，`parent.children`的节点数量已经从2变为了1，索引`[1]`已经不存在了。

> 因此，删除多个节点时，要注意`children`属性时刻都在变化。

### 7.操作表单

用JavaScript来操作表单，可以获得用户输入的内容，或者对一个输入框设置新的内容。

HTML表单的输入控件主要有以下几种：

- 文本框，对应的`<input type="text">`，用于输入文本；
- 密码框，对应的`<input type="password">`，用于输入密码；
- 单选框，对应的`<input type="radio">`，用于选择一项；
- 复选框，对应的`<input type="checkbox">`，用于选择多项；
- 下拉框，对应的`<select>`，用于选择一项；
- 隐藏文本，对应的`<input type="hidden">`，用户不可见，但表单提交时会把隐藏文本发送到服务器。

#### 获取值

如果我们获得了一个`<input>`节点的引用，就可以直接调用`value`获得对应的用户输入值：

```html
// <input type="text" id="email">
var input = document.getElementById('email');
input.value; // '用户输入的值'
```

这种方式可以应用于`text`、`password`、`hidden`以及`select`。但是，对于单选框和复选框，`value`属性返回的永远是HTML预设的值，而我们需要获得的实际是用户是否“勾上了”选项，所以应该用`checked`判断：

```javascript
// <label><input type="radio" name="weekday" id="monday" value="1"> Monday</label>
// <label><input type="radio" name="weekday" id="tuesday" value="2"> Tuesday</label>
var mon = document.getElementById('monday');
var tue = document.getElementById('tuesday');
mon.value; // '1'
tue.value; // '2'
mon.checked; // true或者false
tue.checked; // true或者false
```

#### 设置值

设置值和获取值类似，对于`text`、`password`、`hidden`以及`select`，直接设置`value`就可以：

```html
// <input type="text" id="email">
var input = document.getElementById('email');
input.value = 'test@example.com'; // 文本框的内容已更新
```

对于单选框和复选框，设置`checked`为`true`或`false`即可。

#### HTML5控件

HTML5新增了大量标准控件，常用的包括`date`、`datetime`、`datetime-local`、`color`等，它们都使用`<input>`标签：

```html
<input type="date" value="2015-07-01">
<input type="datetime-local" value="2015-07-01T02:03:04">
<input type="color" value="#ff0000">
```

#### 提交表单

JavaScript可以以两种方式来处理表单的提交（AJAX方式在后面章节介绍）。

方式一是通过`<form>`元素的`submit()`方法提交一个表单，例如，响应一个`<button>`的`click`事件，在JavaScript代码中提交表单：

```html
<!-- HTML -->
<form id="test-form">
    <input type="text" name="test">
    <button type="button" onclick="doSubmitForm()">Submit</button>
</form>

<script>
function doSubmitForm() {
    var form = document.getElementById('test-form');
    // 可以在此修改form的input...
    // 提交form:
    form.submit();
}
</script>
```

这种方式的缺点是扰乱了浏览器对form的正常提交。浏览器默认点击`<button type="submit">`时提交表单，或者用户在最后一个输入框按回车键。

因此，第二种方式是响应`<form>`本身的`onsubmit`事件，在提交form时作修改：

```html
<!-- HTML -->
<form id="test-form" onsubmit="return checkForm()">
    <input type="text" name="test">
    <button type="submit">Submit</button>
</form>

<script>
function checkForm() {
    var form = document.getElementById('test-form');
    // 可以在此修改form的input...
    // 继续下一步:
    return true;
}
</script>
```

注意要`return true`来告诉浏览器继续提交，如果`return false`，浏览器将不会继续提交form，这种情况通常对应用户输入有误，提示用户错误信息后终止提交form。

在检查和修改`<input>`时，要充分利用`<input type="hidden">`来传递数据。

例如，很多登录表单希望用户输入用户名和口令，但是，安全考虑，提交表单时不传输明文口令，而是口令的MD5。普通JavaScript开发人员会直接修改`<input>`：

```html
<!-- HTML -->
<form id="login-form" method="post" onsubmit="return checkForm()">
    <input type="text" id="username" name="username">
    <input type="password" id="password" name="password">
    <button type="submit">Submit</button>
</form>

<script>
function checkForm() {
    var pwd = document.getElementById('password');
    // 把用户输入的明文变为MD5:
    pwd.value = toMD5(pwd.value);
    // 继续下一步:
    return true;
}
</script>
```

这个做法看上去没啥问题，但用户输入了口令提交时，口令框的显示会突然从几个`*`变成32个`*`（因为MD5有32个字符）。

要想不改变用户的输入，可以利用`<input type="hidden">`实现：

```html
<!-- HTML -->
<form id="login-form" method="post" onsubmit="return checkForm()">
    <input type="text" id="username" name="username">
    <input type="password" id="input-password">
    <input type="hidden" id="md5-password" name="password">
    <button type="submit">Submit</button>
</form>

<script>
function checkForm() {
    var input_pwd = document.getElementById('input-password');
    var md5_pwd = document.getElementById('md5-password');
    // 把用户输入的明文变为MD5:
    md5_pwd.value = toMD5(input_pwd.value);
    // 继续下一步:
    return true;
}
</script>
```

注意到`id`为`md5-password`的`<input>`标记了`name="password"`，而用户输入的`id`为`input-password`的`<input>`没有`name`属性。没有`name`属性的`<input>`的数据不会被提交。

#### 操作文件

在HTML表单中，可以上传文件的唯一控件就是`<input type="file">`。

> *注意*：当一个表单包含`<input type="file">`时，表单的`enctype`必须指定为`multipart/form-data`，`method`必须指定为`post`，浏览器才能正确编码并以`multipart/form-data`格式发送表单的数据。

出于安全考虑，浏览器只允许用户点击`<input type="file">`来选择本地文件，用JavaScript对`<input type="file">`的`value`赋值是没有任何效果的。当用户选择了上传某个文件后，JavaScript也无法获得该文件的真实路径：

通常，上传的文件都由后台服务器处理，JavaScript可以在提交表单时对文件扩展名做检查，以便防止用户上传无效格式的文件：

```html
var f = document.getElementById('test-file-upload');
var filename = f.value; // 'C:\fakepath\test.png'
if (!filename || !(filename.endsWith('.jpg') || filename.endsWith('.png') || filename.endsWith('.gif'))) {
    alert('Can only upload image file.');
    return false;
}
```

**File API**

由于JavaScript对用户上传的文件操作非常有限，尤其是无法读取文件内容，使得很多需要操作文件的网页不得不用Flash这样的第三方插件来实现。

随着HTML5的普及，新增的File API允许JavaScript读取文件内容，获得更多的文件信息。

HTML5的File API提供了`File`和`FileReader`两个主要对象，可以获得文件信息并读取文件。

### 8.JQuery

> 在线手册推荐:http://hemin.cn/jq/

使用jQuery只需要在页面的`<head>`引入jQuery文件即可：

```html
<html>
<head>
    <script src="lib/jquery-3.6.0.js"></script>
	...
</head>
<body>
    ...
</body>
</html>
```

**公式: $(selector).action()**

```html
<body>
<a href="#" id="test-jquery">点我</a>
<script>
    <!--js写法-->
    document.getElementById('id');

    //jquery写法(选择)
    $('#test-jquery').click(function (){
        alert("点击成功")
    })
</script>
</body>
```

#### 8.1选择器

```html
<script>
    <!--原生js写法-->
    document.getElementById();
    document.getElementsByTagName();
    document.getElementsByName();

    //jQuery写法(选择器跟css一样)
    $('p').click();//标签选择器
    $('#id1').click();//id选择器
    $('.class1').click();//类选择器
    
</script>
```

#### 8.2事件

![image-20211226200909875](https://cdn.jsdelivr.net/gh/xiaoxingOvO/Typora-picture@master/img/202112262009743.png)

```html
<!--要求:获取鼠标当前的一个坐标-->
mouse:<span id="mouseMove"></span>

<script>
    //当网页元素加载完毕后,响应事件
    $(document).mousemove(function(e){
        $("#mouseMove").text(e.pageX + ", " + e.pageY);
    });

</script>
```

#### 8.3操作DOM

节点文本操作

```html
<body>
<ul id="test-ul">
    <li class="js"></li>
    <li name="python"></li>
</ul>
<script>
    // document.getElementById();
    $('#test-ul li[name=python]').text();//获得值
    $('.js').text('js');//设置值
    $('#test-ul').html();//获得值
    $('#test-ul').html('<p>123</p>');//设置值
</script>
```

操作css

```html
$(".js").css({ "color": "#ff0011", "background": "blue" })
```

元素的显示和隐藏

```
//元素的显示和隐藏
// $(".js").show();
$(".js").hide();
```

