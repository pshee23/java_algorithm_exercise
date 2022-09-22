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
<summary>Character 클래스로 대소문자 판별 or 변환</summary>

- char의 값을 객체로 포장한다
- isLowerCase(), isUpperCase(), toLowerCase(), toUpperCase()
```java
// 소문자인지 확인
if(Character.isLowerCase(ch)) 

// 대문자로 변환
answer += Character.toUpperCase(ch);
```
</details>

<details markdown="1">
<summary>문자열 붙이는 방식의 차이 [concat, +, StringBuilder]</summary>


### concat
- 초기값이 null이면 붙일 수 없음. new String( ) 해야됨.
- 문자열을 계속해서 붙인다고 가정하면, 붙일때마다 새로운 주소값 할당 받게 됨
- 연달아서 붙일 수 있음
    
```java
String str = new String();
String result = str.concat("Hi");
String strs = result.concat(" Hello").concat(" World");
```

### StringBuilder
    
- 초기화를 안해도 된다.
- 문자열을 계속 붙여도 주소값이 변하지 않는다
- append로 문자열을 붙임
- null 인 String과 붙이면 “null”이라는 문자열이 붙어짐
- \+ 연산자는 컴파일 될 때 StringBuilder로 변환되기 때문에 + 연산자와 함께 쓰는 것은 성능에 좋지 않다.
    
```java
StringBuilder result = new StringBuilder();
result.append("Hi");
result.append(" Hello");
```
</details>

<details markdown="1">
<summary>Integer 최대 최소 값 설정과 활용 방안 [Integer.MIN_VALUE]</summary>

- 편리함과 안전성
- 초기화시 대소비교에 영향을 받지 않은 숫자를 설정할 수 있음
    
    ```java
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    // Byte, Short, Int, Long
    ```
</details>

<details markdown="1">
<summary>특정 값으로 문자열 분리 [split(” ”)]</summary>

- 정규표현식, 특정 문자를 기준으로 문자열을 나누어 배열에 저장
- 원본은 수정 안됨
    
    ```java
    String str = "010-1234-5678";
    String[] split1 = str.split("-");
    String[] split2 = str.split("-", 2); // 배열을 2의 크기만큼만 생성. [010, 1234-5678]
    ```

</details>

<details markdown="1">
<summary>특정 문자 발견 위치 반환 [indexOf()]</summary>

- 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
- 찾지 못했을 경우 “-1” 반환
- indexOf(”찾을 특정 문자”, “시작할 위치”) 시작 위치 생략 가능
- 공백도 위치로 인식

    ```java
    String str = "Hello World";
    str.indexOf("o"); // 4
    str.indexOf("o", 5); // 7
    ```
    
- lastIndexOf() : 뒤에서부터 처음 발견되는 인덱스 반환
</details>

<details markdown="1">
<summary>문자열 자르기 [subString()]</summary>

- subString(int index)
- 문자열의 앞에서부터 index 위치 포함하여 자른 뒤, 이후의 모든 문자열을 리턴
    
    ```java
    String str = "0123456789";
    str.subString(5); // 56789 (01234의 5개 문자열 삭제)
    ```
    
- subString(int  beginIndex, int endIndex)
- beginIndex 위치에서 시작하여 endIndex 전 위치(endIndex - 1)까지의 값 리턴
    
    ```java
    String str = "0000003565120";
    str.subString(6, 12); // 356512
    ```

</details>

<details markdown="1">
<summary>문자열 뒤집기 [StringBuilder(x).reverse()]</summary>

```java
String str = "abcde";
// 초기화(str), reverse 함수, String 화
String answer = new StringBuilder(str).reverse().toString();
```
</details>


<details markdown="1">
<summary>String 배열 초기화 [new String[n]]</summary>

```java
int n = 5;
String[] str = new String[n];
```
</details>


<details markdown="1">
<summary>입력받은 인자값을 지정된 데이터형으로 변환 [String.valueOf(s)]</summary>

- 인자값 : byte, int, long, double, boolean 등

    ```java
    Integer a = Integer.valueOf(7); // 7
    Double b = Double.valueOf(5);   // 5.0
    Float c = Float.valueOf("38");  // 38.0
    Integer d = Integer.valueOf("100", 16) // 256 : 100을 16진수로
    ```

- char 배열을 String 화
    
    ```java
    char[] s = x.toCharArray();
    String answer = String.valueOf(s);
    ```
</details>


<details markdown="1">
<summary>Character 클래스로 특수문자인지 일반 문자인지 판별</summary>
    
```java
if(Character.isAlphabetic)
// is.. 판별 기능 더 있음
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
