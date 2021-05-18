### 버블 정렬 (bubble sort) 

#### 0. 알고리즘 연습 방법
* 알고리즘을 잘 작성하기 위해서는 잘 작성된 알고리즘을 이해하고, 스스로 만들어봐야 함
  - 모사! 그림을 잘 그리기 위해서는 잘 그린 그림을 모방하는 것부터 시작


<div class="alert alert-block alert-info">
<center><strong><font size=4em>알고리즘 연습 방법</font></strong></center>

<font size=3em>1. 연습장과 펜을 준비하자.</font><br><br>
<font size=3em>2. 알고리즘 문제를 읽고 분석한 후에,</font><br><br>
<font size=3em>3. 간단하게 테스트용으로 매우 간단한 경우부터 복잡한 경우 순서대로 생각해보면서, 연습장과 펜을 이용하여 알고리즘을 생각해본다.</font><br><br>
<font size=3em>4. 가능한 알고리즘이 보인다면, 구현할 알고리즘을 세부 항목으로 나누고, 문장으로 세부 항목을 나누어서 적어본다.</font><br><br>
<font size=3em>5. 코드화하기 위해, 데이터 구조 또는 사용할 변수를 정리하고,</font><br><br>
<font size=3em>6. 각 문장을 코드 레벨로 적는다.</font><br><br>
<font size=3em>7. 데이터 구조 또는 사용할 변수가 코드에 따라 어떻게 변하는지를 손으로 적으면서, 임의 데이터로 코드가 정상 동작하는지를 연습장과 펜으로 검증한다.</font><br>
</div>

#### 1. 정렬 (sorting) 이란?
- 정렬 (sorting): 어떤 데이터들이 주어졌을 때 이를 정해진 순서대로 나열하는 것
- 정렬은 프로그램 작성시 빈번하게 필요로 함
- 다양한 알고리즘이 고안되었으며, 알고리즘 학습의 필수

> 다양한 정렬 알고리즘 이해를 통해, 동일한 문제에 대해 다양한 알고리즘이 고안될 수 있음을 이해하고,
> 각 알고리즘간 성능 비교를 통해, 알고리즘 성능 분석에 대해서도 이해할 수 있음

#### 2. 버블 정렬 (bubble sort) 란?
* 두 인접한 데이터를 비교해서, 앞에 있는 데이터가 뒤에 있는 데이터보다 크면, 자리를 바꾸는 정렬 알고리즘

##### 직접 눈으로 보면 더 이해가 쉽다: https://visualgo.net/en/sorting

<img src="https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif" width=600/>

> 출처: https://en.wikipedia.org/wiki/Bubble_sort

#### 3. 어떻게 코드로 만들까?

> 알고리즘 연습 방법에 기반해서 단계별로 생각해봅니다.

<div class="alert alert-block alert-warning">
<strong><font color="blue" size="4em">프로그래밍 연습</font></strong><br>
데이터가 두 개일 때 버블 정렬 알고리즘 방식으로 정렬해보세요<br>
</div>

<div class="alert alert-block alert-warning">
<strong><font color="blue" size="4em">프로그래밍 연습</font></strong><br>
데이터가 세 개일 때 버블 정렬 알고리즘 방식으로 정렬해보세요<br>
</div>

<div class="alert alert-block alert-warning">
<strong><font color="blue" size="4em">프로그래밍 연습</font></strong><br>
데이터가 네 개일 때 버블 정렬 알고리즘 방식으로 정렬해보세요<br>
</div>

* 데이터가 네 개 일때 (데이터 갯수에 따라 복잡도가 떨어지는 것은 아니므로, 네 개로 바로 로직을 이해해보자.)
  - 예: data_list = [1, 9, 3, 2]
    - 1차 로직 적용
      - 1 와 9 비교, 자리바꿈없음 [1, 9, 3, 2]
      - 9 와 3 비교, 자리바꿈 [1, 3, 9, 2]
      - 9 와 2 비교, 자리바꿈 [1, 3, 2, 9]
    - 2차 로직 적용
      - 1 와 3 비교, 자리바꿈없음 [1, 3, 2, 9]
      - 3 과 2 비교, 자리바꿈 [1, 2, 3, 9]
      - 3 와 9 비교, 자리바꿈없음 [1, 2, 3, 9]
    - 3차 로직 적용
      - 1 과 2 비교, 자리바꿈없음 [1, 2, 3, 9]
      - 2 과 3 비교, 자리바꿈없음 [1, 2, 3, 9]
      - 3 과 9 비교, 자리바꿈없음 [1, 2, 3, 9]

#### 4. 알고리즘 구현
* **특이점 찾아보기**
  - n개의 리스트가 있는 경우 최대 n-1번의 로직을 적용한다.
  - 로직을 1번 적용할 때마다 가장 큰 숫자가 뒤에서부터 1개씩 결정된다.
  - 로직이 경우에 따라 일찍 끝날 수도 있다. 따라서 로직을 적용할 때 한 번도 데이터가 교환된 적이 없다면 이미 정렬된 상태이므로 더 이상 로직을 반복 적용할 필요가 없다.

<img src="https://www.fun-coding.org/00_Images/bubblealgo.png" />

1. for num in range(len(data_list)) 반복
2. swap = 0 (교환이 되었는지를 확인하는 변수를 두자)
2. 반복문 안에서, for index in range(len(data_list) - num - 1) n - 1번 반복해야 하므로
3. 반복문안의 반복문 안에서, if data_list[index] > data_list[index + 1] 이면
4.                data_list[index], data_list[index + 1] = data_list[index + 1], data_list[index]
5.                swap += 1
6. 반복문 안에서, if swap == 0 이면, break 끝


```python
def bubblesort(data):
    for index in range(len(data) - 1):
        swap = False
        for index2 in range(len(data) - index - 1):
            if data[index2] > data[index2 + 1]:
                data[index2], data[index2 + 1] = data[index2 + 1], data[index2]
                swap = True
        
        if swap == False:
            break
    return data
```


```python
import random

data_list = random.sample(range(100), 50)
print (bubblesort(data_list))
```

<br>

#### 💻 직접 해보기.java
```java
public class Question1 {

	public static void main(String[] args) {
		Scanner sInput = new Scanner(System.in);
		int[] inputInt = new int[5];
		
		for(int i=0; i<inputInt.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력: ");
			inputInt[i] = sInput.nextInt();
		}
		
	//Bubble Sort
		for (int i = 0; i < inputInt.length-1; i++) {
                   for (int j = 0; j < (inputInt.length-i)-1; j++) { // 배열 0부터 끝까지 한번 돌면 제일 큰 수는 맨 끝에 자리하게 되어 있으니 그 다음부터는 그 수 비교 하지 않아도 되므로  -1
               	     if (inputInt[j]> inputInt[j+1]) { //비교 후 큰 수를 
                        int bubbleSort = inputInt[j]; // 변수에 임시로 담고 (큰 수를 잠시 다른 공간에 이사시키고)
                        inputInt[j] = inputInt[j+1]; //그 다음 수를 변수로 간 수의 배열 자리에 옮겨넣기  (그 자리에 작은 값 땡겨주고)
                        inputInt[j+1] = bubbleSort; // 다음 원소의자리에 커서 옮겨간 수를 다시 꺼내 배열에 넣어주기 (다시 큰 수를 배열 넣어주기, 자리바꿈이 일어남)
                     }
                  }
           
              }
		
		System.out.print("정렬된 결과: ");
		for(int bSortInt : inputInt) {
			System.out.print(bSortInt+" ");
		}
		System.out.println();
		System.out.print("정렬 후 첫번째 수와 마지막 수의 합: ");
		System.out.println(inputInt[0]+inputInt[inputInt.length-1]);
		System.out.print("정렬 후 두번째 수와 마지막 수의 곱: ");
		System.out.println(inputInt[1]*inputInt[inputInt.length-1]);
		
	
	}

}

```

#### 5. 알고리즘 분석
* 반복문이 두 개 O($n^2$)
  - 최악의 경우, <font size=5em>$\frac { n * (n - 1)}{ 2 }$</font>
* 완전 정렬이 되어 있는 상태라면 최선은 O(n)