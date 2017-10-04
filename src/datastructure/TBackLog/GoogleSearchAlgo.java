package datastructure.TBackLog;

public class GoogleSearchAlgo {
}

/**
 *
 *
 * Inverted Index:- The inverted index data structure is a central component
 * of a typical search engine indexing algorithm. A goal of a search engine
 * implementation is to optimize the speed of the query: find the documents
 * where word X occurs. Once a forward index is developed, which stores lists
 * of words per document, it is next inverted to develop an inverted index.
 * Querying the forward index would require sequential iteration through each
 * document and to each word to verify a matching document.
 *
 * Crawling:- Downloading the web pages, stripping HTML tags,
 * parsing the text into separate terms.
 *
 * Indexing
 * Storing every occurrence of a term to its posting list within the inverted index.
 *
 *Search

 During search those web pages are identified which contain all query terms (for Boolean AND).

 First the posting lists for all query terms are loaded from the inverted index.

 Then the posting lists are intersected to find those DocID which occur
 in all posting lists .

 Then the matching DocID have to be sorted by the rank.

 For the top-10 ranked DocID the documents (web pages) have to be loaded
 from the document store.

 From those 10 web pages the final results are generated and formatted
 with title, summary, Url and transferred back to the user.

 Length of the Posting List:

 The maximum length of a posting list (number of docids) is
 almost equal to the number of indexed documents.
 *

 */
