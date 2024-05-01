# CSS GRID

#### CSS grid layout is a brand new module that brings a twi-dimensional grid system to CSS for the first time.

#### CSS grid replaces float layouts, using less, and more readable and logic css and html.

#### CSS grid works perfectly together with flex, which is best to handle one dimensional component and layouts.

#### CSS grid completely changes the way that we envision and build two dimensional layouts.




### fr = fractional unit


# Explicit vs implicit grids

grids cells that we define are explicit grids and the section of grid that
remains which gets automatically aligned down are implicit grids

properties of implicit grids:

grid-auto-rows:50px; //to give row size to implicit grids


implicit grids are by default aligned down(rows) but we can changes its position by

grid-auto-flow:col; //now remaining sections will be placed in col wise




## NOTE:

* justify: always means horizontal alignment or in x axis or row-axis
* align: always means vertical alignment or in y-axix or col-axis

* items(align-items/justify-items) means perticular item in grid
* content(align-content/justify-content) means whole grid item
    
    
    

## to fill the gaps automatically use dense using dense automatically cells will be placed inside the empty holes
    grid-auto-flow: row dense;