# gilded-rose-java

Exercising TDD and Refactoring muscles with the Gilded Rose Kata. Take a look at commits to see a progression of my approach. 
Checkout the tag "baseline" if you'd like to start at the beginning.

![Codiga Analysis](https://api.codiga.io/project/30830/score/svg)

## General Approach
* Wrote a text-based test to serve as a regression/acceptance test
* Used strangler approach to extract special cases one by one, using TDD, guided by the acceptance test
* Extracted the common case and removed the old logic once acceptance test passed
* Lots of refactoring to extract a set of ItemUpdater classes and build a map-based factory
* Implemented new functionality...very easy following the refactor
* Updated regression/acceptance test to include the new functionality

## Thank You
Thank you to @emilybache for providing the starting point. Check out her work in providing starting points for different languages at 
https://github.com/emilybache/GildedRose-Refactoring-Kata
