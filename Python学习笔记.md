# Python学习笔记 (ver 0.1)
## Basic Info

### Characteristics

- Python can be treated in a procedural way, an object-orientated way or a functional way.
- uses new lines to complete a command
- relies on indentation, using whitespace, to define scope

### Tools

* IDE
	* IDLE - Python IDLE is an environment for writing, editing, debugging and running Python programs. 
		* Python自带
		* Command Line Tool
	* Thonny, Pycharm, Netbeans or Eclipse
* scripts - your code files

### Fundamental Components

* Variables
	* consist of "name" and "value"
	* used to store data in our programs
	* dynamic type - variable type can change. 在有的语言里type必须被预先定义且不能更改, e.g. Java
	* name - 开头不能是数字或符号
* Datatypes
	* Integers
	* Strings
	* Floats: 包含decimal number的数
* **Module** - i.e. packages in Java
    * Usage
    		* Syntax:
    			* import <Module_name>        ---导入指定的module
    		* Functions - i.e. classes in Java
    			* from module_name import function_name - 指令，用于导入指定module下的一项指定功能
    				* 好处：使用该方式导入时，使用功能时不用添加module_name
    	* 每一个module可以有多个function
* Functions
    * Def: A function is a block of code to carry out a specific task, will contain its own scope and is **called by name**. All functions may contain zero(no) arguments or more than one arguments. On exit, a function can or can not return one or more values.
    * +similar with static methods in java
* Methods
    * similar to a function but used for an object for which it is called
    * accessible to data that is contained within the class

## Numbers

* Mathematic operator
    * +-*/
    * modulo operator - %， 用于求余数
    * a = a + b 有一种简写方式 i.e a += b
      * +号外的的其他运算符号同理

* Python的计算顺序-BODMAS system
    * Brackets - `()`
    * Order
    * Division
    * Multiplication
    * Addition
    * Subtraction
* Related Functions
    * `round()` - 取整
    * `math.floor()` - 向下取整
    * `math.ceil()` - 向上取整
* Built-in Constants
    * `math.pi` - an approximate number close to $\pi$

#### Casting
* Def: convert a datatype to another datatype

## Methods

* Syntax: `<object>.<method>()`
* Designing methods
    * When defining an instance method, the first parameter of the method should always be **self**
    * when invoking a method, we do not pass anything for the self argument

## [Strings](https://docs.python.org/3/library/stdtypes.html#text-sequence-type-str)

an immutable data type, can't be changed

### Create Strings - `'This is a string'`

* 所有strings 必须用引号包围
* 单引号，双引号包围都可以
* 连续三个引号（单引号或双引号）可以让引号内的内容全部变成Strings

### String Concatenation

- Def: Combine 2 or more strings
- Operators: `+` & `*`
- string 不能和 integer 合并
- `str()`可以把其他type转换成str

### String Formatting

* create new, formatted strings from given strings
    * 会自动把其他type转换为str
* `str.format()` - [Link](https://docs.python.org/3/library/stdtypes.html?highlight=format#str.format)
* Syntax:  ` "{1} - {0}".format(A,B)`
    * Output: `B - A`
    * 大括号内为要替换的内容
    * 序号（0、1）表示后面format里的第N个变量。 序号从0开始。这里0代表A, 1代表B
    * 变量（A、B）表示不同的string

### Common Methods

- `count()` - 计算频次
- `capitalize()` - 首字母大写
- `title` - 每个单词的首字母都大写
- `upper` - 全部大写
- `lower` - 全部小写
- `isupper` - 检验是否为大写
- `islower` - 检验是否为小写
- `istitle` - 检验是否符合title格式
- `isalpha` - 检验是否为字母
- `isdigit` - 检验是否为数字
- `isalnum` - 检验是否只包括字母和数字
- `index` - 返回指定字段的起始位置，从0开始计数，如果找不到指定字段，则报错
- `str.find(sub[, start[, end]])` - Return the lowest index in the string where substring *sub* is found within the slice `s[start:end]`. Return -1 if not found
- `strip(<string_to_be_removed>)` - Return a copy of the string with trailing characters removed from both sides. removing whitespaces by default
- `lstrip()` - 只删除左边的指定字段
- `rstrip()` - 只删除右边的指定字段
- `replace(old, new[, count])` - Return a copy of the string with all occurrences of substring *old* replaced by *new*. If the optional argument *count* is given, only the first *count* occurrences are replaced.
- `def __str__(self):` - 定义该object被print时返回的结果, similar to `toString()` in java

### Related Functions

- `len()` - return the length

### Slice a string

* String is an array of characters
* index - 文本中每一个字符的地址，从0开始计数
* iterable - you can access individual elements
* Syntax
    * `variable[index_number]` - 返回指定地址的字符
        * e.g. `variable[2:]` - return the substring from index 2 to the end
    * `variable[start_index:end_index:step]` 则会返回包含start到end为止，以step步长前进的字符。（不包含end）
        - step - 步长，即选出指定步长所踩中的字符。若step为-1，则字段将倒转
        - 需要返回从指定位置开始直到最后的字符，则把end_index的位置留空，如 variable[5:]
        - 同样，需要返回从开始到指定位置结束的字符，则把start_index的位置留空，如 variable[:6]
        - start_index和end_index的值如果为负数，则会从右边开始数起，如 -1 则表示倒数第2个字符
    * `.index()`
        - index功能 - .index("word") - 返回word这一字段出现的起始地址

## Input & Output as Files
### Input

- Function
    - `input()` - request input from the keyboard
      
        - `input(<string>)` - 显示出括号内的string - i.e. 提示用户要输入什么信息
    - Get input from files
        - class *file* is in *io* module
        - Functions
          
            - `open([filename], [mode])` - Open a file, returning an object of the *file* type
            
                - Modes
            
                    - `"r"` - Read - Default value. 
            
                        `"a"` - Append - Opens a file for appending, creates the file if it does not exist
            
                        `"w"` - Write - Opens a file for writing, creates the file if it does not exist
            
                        `"x"` - Create - Creates the specified file, returns an error if the file exists
			            
    		        - `"t"` - Text - Default value. Text mode
    		        
    		            `"b"` - Binary - Binary mode (e.g. images)
    - Methods
        - `read()` - get the remaining contents of the file from current position and return it as a string (in text mode) or bytes object(in binary mode)
        - `readline([size])` - Read and return one line from the stream. If size is specified, at most size bytes will be read. similar to `nextLine()` in Java
        - `readlines([sizehint])` - Read and return a list of lines from the stream. hint can be specified to control the number of lines read
    - Code statements
      
        - `for line in file:` - same as the `readlines`
- Objects
    - `sys.stdin`
        - need import *sys* module
        - a file object used for all interactive input (including calls to `input()`)

### Output

* File
    * Classification
        * Binary files - no inherent constraints and must be opened in an appropriate program
            * common extensions: .jpg, .mp4, .zip, .exe ...
        * Text files - for editors
            * common extensions: .txt, .html, .csv, .md ...
    * `sys.stdout` - a file object used for the output of print() and expression statements and for the prompts of input();
    * Delete
        * Delete a file - `os.remove([filename])`
        * Delete a folder - `os.rmdir([filename])`
    * Check if file exist - `os.path.exists([filename])` - return a boolean value
    * Methods
        * `writelines()` - write an array of string, without newline character 
        * `write([string])` - writes the contents of *string* to the file, returning the number of characters written.

### Reference

- [[How to edit a file in-place](http://stupidpythonideas.blogspot.com/2014/09/how-to-edit-file-in-place.html)](http://stupidpythonideas.blogspot.com/2014/09/how-to-edit-file-in-place.html)


## Logic

* Boolean type - True 和 False的首字母必须大写

### Logical Operators
-  return a boolean value
- Operators
    - `>`
    - `<`
    - `==` - used to test if two variables are equal or not
    - `!=` 不等于
    - `>=`
    - `<=`

### If-else statements
- Syntax
    ```python
    if condition:
    	code1
    elif condition:
    	code2
    else:
    	codeN
    ```
- 使用时可以用()把语句包围起来

### Logical Keywords
- `True`
- `False`
- `not`
- `and`
- `or`
- `in` -if the first operand is in the second operand, return True, otherwise return False
- `is` -for testing object identity

## Data Structure

### Lists - similar to an array

* Create a list
    * Using square brackets `l = ["a", "b", "c"] `
    * Using the constructor `list()` or `list(iterable)`
    * Create an empty list - `l = []`
    * [List Comprehensions](https://docs.python.org/2/tutorial/datastructures.html#list-comprehensions) - a concise way to create lists
* Characteristics
    * Lists可以同时包含不同datatype的元素
    * iterable - 里面的每一个元素都有对应的index地址
    * mutable
* Lists可以包含Lists，因此slice可以一直深入到最里面
	* e.g `Lists[3][2][1]` - Lists 中index地址为3的元素里index地址为2的元素里index地址为1的元素
	* 2-dimensions List - could be used to create a table
	* 一个List即相当于一个维度
* `del` - 可用于移除 List里指定index地址的元素
	* e.g del variable[0:2] i.e 移除variable里第一个和第二个元素
* Methods
    * `.remove()` - 移除 List里指定值的元素
    * `.append()`- 向 List里追加指定的元素到尾部
    	* .append不能用于给另一个变量赋值，因为.append本身是一个command,它会引起改变指定变量的行为，不是一个值
    * `.insert(index_number,element)` - 将element插入到index_number的位置
* `list()` - 可以把iterable data变成List，该List将创建一个包含iterable data里的每个元素的list

### Tuples - immutable lists

* Syntax： `variable = (element_A, element_B, element_C)`
* `tuple()`可以把指定元素转换为Tuple

### Range

* `range(start, stop, step)` 可以创建一个从start到stop, 步长为step的data
- range is an immutable sequence of numbers and is commonly used for looping a specific number of times in for loops.

### Dictionaries

* Syntax： `{key_1:value_1, key_2:value_2, key_3:value_3}`
* Characteristics
    * not indexable - Dictionaries没有顺序
* Item - a pair of key and value
* Operations
    * change an item - `dictionary_name[key] = value`
    * visit an item in the dictionary - `dictionary[key]` - return the value corresponding to the key
* Methods
	* `.keys()` - return all the keys
	* `.values()` - return all the values
	* `.items()` - return all the items
* Dictionaries 的值可以是List
	* Slice这个值List中某一个元素的方法
		* e.g variable["key"][0:3]
		* i.e 选出variable里key这个关键词的值的第1个到第4个元素
* A dictionary may be an element of the other dictionary

## Loop

### While Loop

* Syntax：

  ```python
  while condition:
  	code...
  ```

### For Loop

* A for loop is used for iterating over a sequence (that is either a list, a tuple or a string).
* Syntax:

  ```python
  for letter in "abcd"
  	print(letter)
  ```

	* Output: 
      ```python
      a
      b
      c
      d
      ```
* 每次执行循环后，variable 将会变成 the iterable序列的下一个元素

### List Comprehensions

* Def: List comprehension is a shortcut method to combine variables, for loops, logic, if statement to comprehend a list.
* e.g. `even_numbers = [x for x in  range(1, 101) if x % 2 == 0]` - 把even_number赋值为 1-101之间的偶数(不含101)组成的List
* `.split()` - 可以把string里的每一个单词列出，合成为一个list
* `.join()` - 在List的每一个元素之间插入一个字段，并合并为string
* +Keyword - `break` 用于跳出当前loop，到上一级嵌套里
## Functions

### Create Functions

* Def: Function is a block of organized and reusable code that performs an action or give some results.
* 使用function - Calling a function
* 如果你需要一个function 返回它的结果，那么就必须在定义里的code加上 return
* Syntax：

  ```python
  def function_name([parameters]):
  	code...
      return something
  ```

### Variable Scope

* Variable Scope只有两种
	* global - 变量适用于整个程序
	    * In local scope, you can access a global variable, but can't modify it.
	    * 例外 - If a global variable is a list or dictionary, modify slices in a local scope will change it in global scope
	* local - 变量只适用于特定范围
	    * by default, variables declared in a function are local variables
* `global <variable>` - 可以修改该variable的范围为global

### Function Parameter

* Def: a special kind of variable in computer programming language that is used to pass information between functions or procedures. The actual information passed is called an argument.

### Function Arguments

* Def: the actual information passed to a function by a parameter
* default values
    - If the function is called without the argument, the argument gets its default value.
    - optional
    - Parameters with default values have to go last
* Types:
	* positional arguments - arguments are passed by their positions
	    * `function(parameter1, parameter2, parameter3, ...)`
	* keyword arguments - arguments are passed by their key names
		* `function(key_name1 = value, key_name2 = value, ...)`

### Packing and Unpacking arguments
* Used for functions arguments
* **Unpacking** - all elements of it can be passed as different parameters
* **Packing** - pack all arguments into a tuple, used when we don’t know how many arguments need to be passed to a python function

* positional arguments
	
	* Syntax： `*<iterable_data>`
* keyword arguments 

  * Syntax：`**<tuple_variable>`

* Conventional naming：
	* `args` - positional arguments的默认名称
	
	* `kwargs` - keyword arguments的默认名称
	
## Object Oriented Programming(OOP)

* Constructor
  * ```python
    def __init__(self):
    	code...
    ```

* Destructor - destroy an object
  * ```python
    def __del__(self):
    	code...
    ```

* Inheritance - child Class将从parent Class继承所有属性
    * Create a child class - `class <child_Class>(<parent_Class>):`
    * `super()` - 指向parent class
    * self - [Link](https://medium.com/quick-code/understanding-self-in-python-a3704319e5f0)

## [Errors and Exceptions](https://docs.python.org/3/tutorial/errors.html)

* Classification

    * Syntax Errors
    * Exceptions

* Handling Exceptions

    * the try statement - may have more than one except clause
    
    * ```python
      # Version 1
      try:
      	code...
	  except <error_name>:
	      code...
	  # Version 2
	  try:
	  	code...
	  except <error_name> as <object_name>:
	      code...
	  ```
	
	- If an exception occurs, the rest of the try clause is skipped
	    - if its type matches, the except clause is executed, and then execution continues after the try statement

## Logging

- [Simple logging in Python ](https://code-maven.com/simple-logging-in-python)
- [Logging in Python – Real Python ](https://realpython.com/courses/logging-python/)
- [logging - Redirect Python 'print' output to Logger - Stack Overflow ](https://stackoverflow.com/questions/11124093/redirect-python-print-output-to-logger/11124247)

## Coding conventions
- 每当新建一个项目，用 #注释 来创建Outline
- Explicit is better than implicit


## Reference

* Courses
    * [The Python Bible™ | Everything You Need to Program in Python | Udemy](https://www.udemy.com/the-python-bible/learn/v4/content)
* Documents
    * [Python Cookbook, 3rd Edition](https://www.oreilly.com/library/view/python-cookbook-3rd/9781449357337/)
    * [Official Documentation](https://docs.python.org/3/)
        * [Python 3.7.4 reference documentation](https://docs.python.org/3/reference/index.html)
        * [Keywords in Python](https://www.programiz.com/python-programming/keyword-list#del)



#Review #Python #PythonLearning #LearningPython