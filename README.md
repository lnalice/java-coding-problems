# java-coding-problems
- Add - my own solution
- Edit - improve solution with book and add various solution
<br />

## ch01

### P01. CountDuplicateCharacters
|input|output|
|--|--|
|da;dflkajd;slf | initial counter is : {;=2, a=2, d=3, f=2, j=1, k=1, l=2, s=1}
||  improved counter is : {;=2, a=2, d=3, f=2, j=1, k=1, l=2, s=1}

### P02. FirstUnrepeatedCharacter

P02 - First Nonrepeated Character <br/>
Let's find a First Nonrepeated Character. <br/>
Please write input text : <br/>
|input|output|
|--|--|
|Let's find a First Nonrepeated Character.| ArrayList soultion:
||Execution time : 13447800 ns ( 13 ms )
||Found Character : L
||
||LinkedHashMap soultion:
||Execution time : 2525900 ns ( 2 ms )
||Found Character : L
||
||function style soultion:
||Execution time : 26071000 ns ( 26 ms )
||Found Character : L

### P03. ReverseWords
P03 - Reverse Words :
|input|output|
|--|--|
|Reverse this words|Array Solution :
||Execution time : 4003400 ns ( 4 ms )
||Reversed : sdrow siht esreveR
||
||StringBuilder Solution :
||Execution time : 2004100 ns ( 2 ms )
||Reversed : sdrow siht esreveR


### P04. ContainsOnlyDigits
input text :
45566336754493420932877387482372374982374823749823283974232237238472392309230923849023848234580383485342234287943943094234745374657346578465783467843653748654376837463847654382382938793287492326
P04 - Contains Only Digits :
|input|output|
|--|--|
||Exception Solution :
||Execution time : 6578000 ns ( 6 ms )
||Digits :true
||
||Java 8 Solution :
||Execution time : 6028700 ns ( 6 ms )
||Digits :true
||
||Regular Expression Solution :
||Execution time : 1022600 ns ( 1 ms )
||Digits :true

### P05. CountVowelsAndConsonants
text is " ... Illinois Mathematics & Science Academy ..."
P05 - Count Vowels And Consonants
|input|output|
|--|--|
||HashMap And Ascii Solution
||Execution time : 12075000 ns ( 12 ms )
||Vowels : 14
||Consonants : 19
||
||DIY Pair Solution
||Execution time : 3005500 ns ( 3 ms )
||Vowels : 14
||Consonants : 19

### P06 - Count Occurrences Of Character
Input text is :
My high school, the Illinois Mathematics and Science Academy, showed me that anything is possible and that you're never too young to think big. At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, or Fermilab. After graduating, I attended Stanford for a degree in economics and computer science.
|input|output|
|--|--|
|| P06 - Count Occurrences Of Character
||Map based soultion:
||Execution time : 3128100 ns ( 2 ms )
||Character 'w' occured 2 time(s)
||
||String based soultion:
||Execution time : 1000700 ns ( 1 ms )
||Character 'w' occured 2 time(s)

### P07 - Conver String to Int, Long, Float, Double
P07 - Convert String to Int, Long, Float, Double
<br />
String is 1233
|input|output|
|--|--|
||Parse Solution
|| Execution time : 1066000 ns ( 1 ms )
|| Integer is 1233
|| Long is 1233
|| Float is 1233.000000
|| Double is 1233.000000
||
||Valueof Solution
|| Execution time : 35480900 ns ( 35 ms )
|| Integer is 1233
|| Long is 1233
|| Float is 1233.000000
|| Double is 1233.000000


### P08 - Remove Whitespaces From String
P08 - Remove Whitespaces From String
<br />
input text is...
<br />
      My high

 school,        the Illinois Mathematics and Science Academy, showed me that anything is possible and that you're never too young to think big. 
At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, 	or Fermilab. After graduating, I attended Stanford for a degree in economics and computer science.

|input|output|
|--|--|
||String Method Solution
||String : Myhighschool,theIllinoisMathematicsandScienceAcademy,showedmethatanythingispossibleandthatyou'renevertooyoungtothinkbig.At15,IworkedasacomputerprogrammerattheFermiNationalAcceleratorLaboratory,orFermilab.Aftergraduating,IattendedStanfordforadegreeineconomicsandcomputerscience.
||Execution time : 2995600 ns ( 2 ms )

### P09 - Join Multiple Strings
P09 - Join Multiple Strings
<br />
|input|output|
|--|--|
||StringBuilder Method
||Execution time : 3996800 ns ( 3 ms )
||String : Dream like a whale
||
||Updated StringBuilder Method
||Execution time : 1003300 ns ( 1 ms )
||String : Dream like a whale
||
||StringJoiner Method
||Execution time : 999600 ns ( 0 ms )
||String : Dream like a whale
||
||String Join Method
||Execution time : 697700 ns ( 0 ms )
||String : Dream like a whale
||
||String Join Method
||Execution time : 1002200 ns ( 1 ms )
||String : Dream like a whale
||
||java 8 Method
||Execution time : 4057500 ns ( 4 ms )
||String : Dream like a whale
