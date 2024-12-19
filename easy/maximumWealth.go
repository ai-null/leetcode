/*
https://leetcode.com/problems/richest-customer-wealth/description/

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/

func maximumWealth(accounts [][]int) int {
	a := 0
	for i := 0; i < len(accounts); i++ {
		b := 0
		for j := 0; j < len(accounts[i]); j++ {
			b += accounts[i][j]
		}

		if b > a {
			a = b
		}
	}
	return a
}
