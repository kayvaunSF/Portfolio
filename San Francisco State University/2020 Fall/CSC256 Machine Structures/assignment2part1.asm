#Translate the following comments into MIPS assembly language.
# (Don't worry about what results the program should compute; 
#just translate it faithfully.) 
#Note that the initializations have been provided.
#Name:
#Date:

.data

prompt:   .asciiz "please input the number: \n"

message:  .asciiz "the result is :\n"


.text
main:

        li $s1, 4         		     # x = 4                             
        li $s2, 5                      # y = 5                           
        li $s3, 10                     # D = 10                                

	li $v0,4                       # print string prompt
        la $a0, prompt                                                    
        syscall                                                               

        li $v0, 5                          #input an integer z to $s0                                                    
        syscall                                                             
	move $s0, $v0
                                   # D = x * x + y * z                                                                                
        mul $t1, $s1, $s1          # $t1= $s1 * $s1                                             
	mul $t2, $s2, $s0	  # $t2= $s2 * $s0
        add $s3, $t1, $t2         # $s3 = $t1 * $t2         
                                  # print string message                                
              li $v0, 4                                                                                                        
	      li $a0, message
	      syscall

		li $v0, 1           # print integer D                 
		move $a0, $s3
		syscall
		
		
     li $v0, 10                    # exit                            
     syscall                                                                     
