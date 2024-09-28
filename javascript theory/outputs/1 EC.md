# JavaScript Code & Multiple Choice Questions

## Code Example

```javascript
var number1 = 2;
var number2 = 5;

function add(a, b) {
  var answer = a + b; // line 1
  return answer;
}

var sum = add(number1, number2); // line 2

console.log(sum); // line 3

console.log(answer); // line 4


---
Multiple Choice Questions

Question 1: Which line gets called before others?

	•	line 1
	•	line 2
	•	line 3
	•	line 4

Explanation:
The function add is invoked in line 2 before anything else is executed, which calls line 1 inside the function.

Question 2: What will be the output of line 3?

	•	2
	•	5
	•	7
	•	10

Explanation:
The add(2, 5) function call returns 7. This value is assigned to the sum variable, so console.log(sum) outputs 7.

Question 3: What will be the output of line 4?

	•	5
	•	7
	•	8
	•	ReferenceError

Explanation:
The answer variable is declared inside the function and thus is not accessible in the global scope. Therefore, console.log(answer) throws a ReferenceError.