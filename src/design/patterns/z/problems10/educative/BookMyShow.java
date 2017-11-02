package design.patterns.z.problems10.educative;

public class BookMyShow {
}

/**
 * Details user Requirements
 * Design Goals :-  latency, consistency and availability.
 * Database SQL or NoSQL
 * Server
 * API
 *
 *
 * To do any design question effectively, its better to clarify your
 * idea with the interviewer. You have to tell interviewer that this is
 * what i know about bookMyShow, is this the only thing expected or
 * i have to inculcate any additional feature as well?
 * Discuss with him , that i know the following points about bookMyShow:

 1. It is used to book movies online.

 2. We can select the city, cinema, seat no. and show time that suits us.

 3. If our account has sufficient money, then the ticket charges are deducted
 from our account after we fill the account information, and a message of
 confirmation is delivered to us. Otherwise, the seat is obviously not booked.

 4. Based on that confirmation message, our ticket gets printed at cinema hall.

 Interviewer might suggest you, if you are missing something. Let us proceed.

 Now, you have to ask him some questions to clarify the idea, like:


 1. How many number of movies can be there?

 2. Do we have to design the application for a particular city/ state/ city
 or worldwide? (Lets say for a country.)

 3. What amount of rate can a single server handle? (For simplicity,
 lets assume 1000/second).

 4. What is the average load(general cases) and the peak load(when movie if
 just released)? (Lets say 3,000 and 10,000 per second).

 5. Do the number of clients/ rate of requests increase with time?
 (Yes, at a rate of 1000 requests/year).

 Ok, so now we have gathered basic information.
 Let us move to the scalability, which is one of the most important things to
 take care of.

 In average case we have 3000 requests/second, and a single server can
 handle 1000/second. So 3 servers are a bare minimum that we need.
 Similarly 10 servers are bare minimum in case of peak load.
 For better performance and things like replication, we will need to deploy
 more servers. (Lets say 5 in average case and 14 in peak cases).

 One of the possible solutions is that we can purchase 5-6 servers to
 efficiently handle average case, and host the application on cloud
 (Microsoft Azure/ Amazon AWS) in peak cases, and pay to them based on pay
 as you go model.

 Second option that we have is that we can purchase our own 15-20 servers to
 efficiently handle peak cases.

 Now let us proceed to design goals.
 Design goals are the factors like latency, consistency and availability.
 Which of the goals is most important to us in this case?

 Latency - The minimum it is, the better, so we must try to minimize latency
 as much as possible.

 According to CAP theorem, if we make system partition tolerant,
 then we can achieve either one of two - Consistency and Availaility.

 Consistency - It is an utmost priority as it might lead to problems when
 the data goes inconsistent (Two persons book the same seat in same auditorium).

 Availability - The more the availability of the system, the better,
 but consistency is more important to us. So we will have to manage with eventual availability.

 Let us proceed to the type of database that we need.

 We have to choose between relational and NoSQL databases, we will choose based on:


 1. Relations in our problem :  There are many relations in our problem, like :

 State -> City.

 City -> Cinema

 Cinema -> Auditorium.

 Auditorium -> Seat No.

 So as there are many relations, relational databases is a better choice based
 upon this factor. So 1 vote for relational databases.

 2. Sharding : Do we need to shard our database? Or a single system is
 good enough ? Well, lets assume for an instance we will fit all the data
 in a single server, if need be, we will do vertical scaling by increasing
 system's RAM, and hard disk. But eventually, it will cause a problem as
 number of requests increase at a rate of 1000/year. So eventually we will
 have to split the database. Even if we use the a single server,
 It will lead to slow down the things as there is only 1 server to grant
 requests. So we need to shard our database.
 So here is a +1 for NoSQL Databases, as horizontal scaling is better for
 NoSQL databases and they shard really well.

 3. Performance: To minimise the latency, we should use NoSQL databases as
 relational databases are packed with many constraints and follow
 ACID properties, which ultimately make them slow. So another +1 for NoSQL databases.

 So for now, let us proceed with NoSQL Databases.

 We will do sharding.

 1.We can follow master slave approach of sharding with 1 master and many
 slaves, such that all the requests to store the data are granted by masters
 and stored in slaves.

 Problem with this approach: Single point of failure. Even if a slave
 replaces the master, it will take sometime for which the system will not be
 available.

 2. 2 Masters many slaves approach : This approach seems to fit, even if 1 master
 fails, other masters will still be available.

 Now how will we store data on systems?

 When we use sharding, its generally preferred to store data in key-value form.
 So we will use hashing to solve the purpose.

 One what bases do we hash?

 1. Suppose 1 server can store 2000 entries. We can store 1-1000 entries in 1st server,
 2001-4000 entries in 2nd server and so on.

 Problem: Load is not divided. When a new movie is released,
 suppose 2000 persons book the ticket, and it is stored in same server.
 While 1 server receives a load of 2000 people, other servers are idle.

 2. We can hash the values to different servers based on id. If we have
 10 servers, we can hash values to different servers using function
 registration_id%10.

 Problem: What if we need to deploy more servers? Will we change hash function
 to reg_id % 11? In that case, what about the entries that you have
 previously inserted into the function using %10, how you will access it?

 A better solution: Use consistent hashing.

 Now we must focus on the APIs that we are supposed to make.

 1. One of the APIs should be to book the show:

 Details Book_My_Show(Customer cust_id, ShowTImeAndVenue show_id);

 A Details class object will be returned which will act as
 a confirmation when you go and get the ticket printed in cinema hall.

 2. payCharges (Customer Cust_Id, ShowTimeAndVenue show_id);

 if your account holds sufficient amount, your show will be
 booked and the charges will be deducted from your account.

 3. Print printDetails (BookMyShow registration_no);

 This API is useful for cinema guys to print the ticket.




 */
