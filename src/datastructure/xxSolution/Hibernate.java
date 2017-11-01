package datastructure.xxSolution;

/**
 * Hibernate is an Object/Relational Mapping tool for Java environments.
 * The term Object/Relational Mapping (ORM) refers to the technique of
 * mapping a data representation from an object model to a relational
 * data model with a SQL-based schema.
 * <p>
 * <p>
 * Hibernate not only takes care of the mapping from Java classes to database
 * tables (and from Java data types to SQL data types), but also provides
 * data query and retrieval facilities. It can also significantly reduce
 * development time otherwise spent with manual data handling in SQL and JDBC.
 * <p>
 * <p>
 * SessionFactory (org.hibernate.SessionFactory)
 * A threadsafe, immutable cache of compiled mappings for a single database.
 * A factory for Session and a client of ConnectionProvider, SessionFactory
 * can hold an optional (second-level) cache of data that is reusable between
 * transactions at a process, or cluster, level.
 * <p>
 * Session (org.hibernate.Session)
 * A single-threaded, short-lived object representing a conversation between
 * the application and the persistent store. It wraps a JDBC connection and is a
 * factory for Transaction. Session holds a mandatory first-level cache of
 * persistent objects that are used when navigating the object graph or looking
 * up objects by identifier.
 * <p>
 * Persistent objects and collections
 * <p>
 * Short-lived, single threaded objects containing persistent state and business function. These can be ordinary JavaBeans/POJOs. They are associated with exactly one Session. Once the Session is closed, they will be detached and free to use in any application layer (for example, directly as data transfer objects to and from presentation).
 * <p>
 * Transient and detached objects and collections
 * <p>
 * Instances of persistent classes that are not currently associated with a Session. They may have been instantiated by the application and not yet persisted, or they may have been instantiated by a closed Session.
 * <p>
 * Transaction (org.hibernate.Transaction)
 * <p>
 * (Optional) A single-threaded, short-lived object used by the application to specify atomic units of work. It abstracts the application from the underlying JDBC, JTA or CORBA transaction. A Session might span several Transactions in some cases. However, transaction demarcation, either using the underlying API or Transaction, is never optional.
 * <p>
 * ConnectionProvider (org.hibernate.connection.ConnectionProvider)
 * <p>
 * (Optional) A factory for, and pool of, JDBC connections. It abstracts the application from underlying Datasource or DriverManager. It is not exposed to application, but it can be extended and/or implemented by the developer.
 * <p>
 * TransactionFactory (org.hibernate.TransactionFactory)
 * <p>
 * (Optional) A factory for Transaction instances. It is not exposed to the application, but it can be extended and/or implemented by the developer.
 */
public class Hibernate {
}


