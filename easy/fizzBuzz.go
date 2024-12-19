import "strconv"

/*
https://leetcode.com/problems/fizz-buzz/description/

Given an integer n, return a string array answer (1-indexed) where:

- answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
- answer[i] == "Fizz" if i is divisible by 3.
- answer[i] == "Buzz" if i is divisible by 5.
- answer[i] == i (as a string) if none of the above conditions are true.
*/

func fizzBuzz(n int) []string {
	var arr = make([]string, 0, n)

	for i := 1; i <= n; i++ {
		s := ""

		if i%3 == 0 {
			s += "Fizz"
		}

		if i%5 == 0 {
			s += "Buzz"
		}

		if s == "" {
			s = strconv.Itoa(i)
		}

		arr = append(arr, s)
	}

	return arr
}
