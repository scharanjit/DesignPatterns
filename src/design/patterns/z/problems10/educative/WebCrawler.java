package design.patterns.z.problems10.educative;


/**
 *Web Crawler :-
 * The process or program used by search engines to
 download pages from the web for later processing by a
 search engine that will index the downloaded pages to
 provide fast searches.

 Internet has a wide expanse of Information.
 Finding relevant information requires an efficient mechanism.
 Web Crawlers provide that scope to the search engine.

 How does web crawler work?
 It starts with a list of URLs to visit, called the seeds..
 As the crawler visits these URLs, it identifies all the hyperlinks
 in the page and adds them to the list of visited URLs, called the crawl frontier.
 URLs from the frontier are recursively visited according to a set of policies.

 Crawling Algorithms


 Web is a huge directed graph, with documents as vertices and hyperlinks as edges.

 Breadth first search traversal
 1.) It uses Queue (FIFO)

 2.) Start with vertext A & visit all connected to A
Enqueue Queue :- B,D,G
 Result A,B,D,G
3.) Dequeue B
 Queue:- D,G,E,F
 Result:-A,B,D,G,E,F
 4.)Dequeue D ...NO place to go anywhere,since all certex visted
 Queue:- G,E,F
 Result:- A,B,D,G,E,F

 5.) Dequqe G ...NO place to go anywhere,since all certex visted
 Queue:- E,F
 Result:- A,B,D,G,E,F

 6.) Dequqe G NO place to go anywhere,since all certex visted
 Queue:- F
 Result:- A,B,D,G,E,F
 7.)  Dequqe F ..we can visit C
 Queue:- C
 Result:- A,B,D,G,E,F,C
 8.) Dequeue C
 Queue:- H
 Result:- A,B,D,G,E,F,C,H


 repeat..all vertex visited



 depth first search traversal
 1.) It uses a Stack (LIFO)
 2.) We need to maintain Result: of visited vertex (pages in case of web crawler)
 3.) First take vertex A ==> put in stack: A
       visited A  Result : A
 4.) Go from A=>B   Stack : A,B
      visited   Result A,B
 5.)   Stack : A,B,E
       Result : A,B,E
 6.) Stack : A,B,E ,G
  Result : A,B,E,G
 7.)POP Stack A,B,E
 Result : A,B,E,G
 8.) POP Stack : A,B
 Result: A,B,E,G
 9.) PUSH STack :A,B,F
 Result: A,B,E,G,F
 10.) PUSH STACK: A,B,F,C
 Result: A,B,E,G,F,C
 11.) PUSH STACK: A,B,F,C,H
 Result : A,B,E,G,F,C,H
 12.) POP STACK :  A,B,F,C

 13.) POP STACK:  A,B,F

 14.) PUSH STACK :  A,B,F,D
 Result:  A,B,E,G,F,C,H,D

 15.)POP
 16.)POP
 17.)POP stack empty
 all vertex visited:-

 vertex is page
edges are hyperlink


 *
 */
public class WebCrawler {
}
