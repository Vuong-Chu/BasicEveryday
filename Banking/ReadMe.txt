Your job is to create a simple banking application.

Implement the following classes:

1.  Bank

-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.

-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.

-  And five methods, they are (their functions are in their names):

    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the branch was added successfully or false otherwise.

    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean. 
    It returns true if the customer was added successfully or false otherwise.

    -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean. 
    It returns true if the customers transaction was added successfully or false otherwise.

    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it exists or null otherwise.

    -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean. Return true if the branch exists 
    or false otherwise. This method prints out a list of customers.
    
 2.  Branch

    -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.

    -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.

    -  And five methods, they are (their functions are in their names):

        -  getName(), getter for name.

        -  getCustomers(), getter for customers.

        -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. Returns true if the customer was added successfully or false otherwise.

        -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.

        -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the Customer if they exist, null otherwise.

3.  Customer

    -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.

    -  A constructor that takes a  String (name of customer) and a double (initial transaction). It initialises name and instantiates transactions.

    -  And three methods, they are (their functions are in their names):

        -  getName(), getter for name.

        -  getTransactions(), getter for transactions.

        -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.

