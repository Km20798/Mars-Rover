# Mars-Rover
it is a java application used to explores Mars by sending remotely controlled vehicles to the surface of the planet

it is a java application used to explores Mars by sending remotely controlled vehicles to the surface of the planet

A rover is to be landed on Mars.once it touch the surface of Mars it will be in Coordinates (4,2) EAST .

you can use this application by sending some instructions to rover and it will return the Coordinates of it's palce . theinstruction you will send will be like this FLFFFRFLB F -> mean forword B -> mean Backword R -> mean Rotate right L -> mean Rotate left

for example 

Input -> FLFFFRFLB 
output -> (6,4) NORTH

there are some obstacles in Mars it's found in coordinates [[1,4], [3,5], [7,4]] 
if rover want to move after this obstacles it will return the final coordinates before obstacles

for example 

input -> LFFFLFF
output -> (4,5) WEST STOPPED
