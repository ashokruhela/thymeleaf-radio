# thymeleaf-radio
Reproduce the bug in Thymeleaf library when using with spring boot
When I set the the th:field of radio button to capture the input by user then it resets the name attribute. 
It works fine if you have a single group but doesn't work when you have a multiple sets. For example, I have an assessmnet page where
multiple question are shown and need to select the answer of each question.
I have reproduced the bug here and couldn't find the answer yet.
