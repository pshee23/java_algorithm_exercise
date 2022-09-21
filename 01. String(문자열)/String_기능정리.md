# 기능 정리

<details markdown="1">
<summary>자바 입력 클래스 [Scanner]</summary>

```java
import java.util.Scanner;
    
// System.in : 사용자로부터 입력을 받기 위한 입력 스트림
Scanner in = new Scanner(System.in);
    
in.next() // String 형 입력 및 리턴 (공백을 기준으로 한 단어)
in.nextLine() // String 형 입력 및 리턴 (개행을 기분으로 한 줄)
    
// 기타 : next(Byte,Short,Int,Long,Float,Double,Boolean)
```
</details>


<details markdown="1">
<summary>String을 Char로 [charAt]</summary>
    
 - String으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 변환
    
```java
String str = "study";
char c = str.charAt(0); // s
char h = str.charAt(2); // u
```
</details>

<details markdown="1">
<summary>문자열을 char형 배열로 [toCharArray]</summary>
    
- 배열의 길이는 문자열의 길이와 같다
- 문자열의 공백 또한 인덱스에 포함
    
```java
String str = "hello world";
char[] arr = str.toCharArray();
// 쉼표로 구분해서 for문 출력 시..
// h, e, l, l, o,  , w, o, r, l, d
```
</details>

<details markdown="1">
<summary></summary>


</details>

<details markdown="1">
<summary></summary>


</details>

<details markdown="1">
<summary></summary>


</details>

