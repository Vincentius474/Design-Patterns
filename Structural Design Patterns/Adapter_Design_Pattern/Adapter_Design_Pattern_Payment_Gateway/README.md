A software developer, Max, has worked on an e-commerce website. The website allows users to shop and pay online. 

The site is integrated with a 3rd party payment gateway, through which users can pay their bills using their credit card. 

Everything was going well, until his manager called him for a change in the project. The manager told him that they are planning to change the payment gateway vendor, and he has to implement that in the code.

The problem that arises here is that the site is attached to the Xpay payment gateway which takes an Xpay type of object.

The new vendor, PayD, only allows the PayD type of objects to allow the process. Max doesn’t want to change the whole set of 100 of classes which have reference to an object of type XPay. This also raises the risk on the project, which is already running on the production. 

Neither he can change the 3rd party tool of the payment gateway. The problem has occurred due to the incompatible interfaces between the two different parts of the code. In order to get the process work, Max needs to find a way to make the code compatible with the vendor’s provided API.

What Max needs here is an Adapter which can sit in between the code and the vendor’s API, and can allow the process to flow.