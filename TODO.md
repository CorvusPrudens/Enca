
- Add visitor method for data so we can organize it into its memory space
- Data addresses, etc should probably be calculated _after_ the first pass, so if we want to support ROM stuff in the future, we'll know how big the instructions are

- GOOD IDEA -- the RAM and ROM address space should be shared. This will be irrelevant for both, since the early bits of ROM will contain instructions anyway

- We'll need a simple expression system (imagine stuff like static structs!)

- It would be nice to be able to get more specific error reports for operands

- Conditional instructions need to be added