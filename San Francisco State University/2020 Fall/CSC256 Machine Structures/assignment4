.data
.text

main:


	li $s0,100 
	li $s1,4 
	li $s2,1 

l4: 	blt $s0,42,exit
l3: 	blt $s2,$s1,l1 
	j l4 

l1: 	div $s0,$s0,$s2 
	bgt $s0,$s2,l2 
	blt $s0,2,l2 
	addi $s2,$s2,1 
	j l3 

l2: 	li $v0,1 
	move $a0,$s0 
	syscall 
	addi $s2,$s2,1
	j l3

exit:
	li $v0,10 
	syscall