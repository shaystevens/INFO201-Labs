# INFO201 lab06
<h2>1. Implementation vs Conceptual Models</h2>
<ol>
<li>Why distinguish between Conceptual and Implementation models at all? What benefits does it bring?
<p> Implementation is a more concrete model while a conceptual model is more abstract model. An implementation model should be easy to take and implement in a SQL database. While a conceptual model would not be possible to implement in a SQL database. The conceptual model is a higher level model this is usally showed to stakeholders, while the implementation is more how you will do the system and has a lot more details around that.
<li>To what extent could you translate between a conceptual-level and an implementation-level model? What additional information might be needed for each translation direction?
<p> You could translate most aspects of a conceptual level but the many to many relationships would be impossible to do in an implementation model but you can change many to many relations by adding a new entity. You can easily transfer from implementation to conceptual but may need additional information around business rules etc.
</ol>
<h2>2. Key Relational Concepts</h2>
<ol>
<li> Relation
<p> A relation is a set of tuples (row).
<li> Relation Variable (or "relvar")
<p> A relvar is the table name
<li> Attribute
<p> An attribute is the column of the table
<li> Domain
<p> A domain is the range the data can be in e.g. 0-10
<li> Primary Key
<p> The primary key is the unique identifier for the table.
<li> Candidate Key
<p> A candidate key is the minimum set of attributes that can uniquely idenity a table
<li> Alternate Key
<p> Candudate key's that are not the primary key.
<li> Foreign Key
<p> A candidate key that is in another relation
<li> Composite Key
<p> Composite key's are keys that are made out of multiple attributes
<li> Surrogate Key
<p> A surrogate key are "invented" keys
<li> Relational Algebra
<p> Relational Algebra is using arthimetic operators to perform operations of tables (querying)
<li> Relational Calculus
<p> Non-procedual query language
<li> Normal Form
<p> Normal Form is to eliminate or reduce redundancy in database tables.
</ol>
</br>
<ol>
<li>Discuss the relationship between the various types of key, i.e., Candidate, Primary, Alternate, Foreign, Composite, and Surrogate. Would a surrogate alternate key make sense? What about a composite surrogate key?
<p> A surrogate alternate key doesn't make a lot of sense it makes more sense to have a surrogate primary key. A composite surrogate key doesn't make sense it is redundent.
<li>Primary keys (and indeed candidate keys in general) are supposed to be irreducible. Explain what this means, and why it would be important.
<p>It means that it can not be further simplified. Primary keys should be made out of the smallest amount of attributes.
<li>Is there a limit to how many attributes should make up a composite key? What would be the pros and cons of using a surrogate key when a suitable composite candidate key already exists?
<p> 16 attributes is the limit for a composite key. 

Pros - Simpiler to use a surrogate key

Cons - Introducing a new key into the table that has no real relation with anything within the table

<li>How do you know on which side of a relationship the foreign key should be placed?
<p>  Foreign keys should be placed on the many side of the database.
<li>What is a lookup table, and how might you implement one in a relational database?
<p> Lookup tables are a reference link to related tables with the help of a unique primary key. You can use joining to implement a lookup table.
<li>How would you implement a many-to-many relationship (as might appear on a conceptual ERD) in a relational database?
<p> Create a new table that will connect the two relationships.
</ol>
</br>
<h2> 5. Normalisation Exercises</h2>
<ol>
<li>Assuming a context of the University of Otago: Is each of the following functional dependencies valid? What about the inverse of each? Explain your reasoning and any assumptions. Note that EFTS stands for Equivalent Full-Time Student, a unit of workload equivalent to typically 40 hours per week for 13 weeks.
<ul>
<li>StudentID → TermAddress
<p> Yes this is a valid functional dependecy. You can change your address and your ID will always be linked to that students address. The inverse is not true you can't change your ID number the address may not always be linked to that students ID number
<li>BirthDate → StudentName
<p> No for both birthdate or name can change and is not be unique.
<li>{SubjectCode, PaperNumber} → EFTS
<p> Yes this is valid the subjectcode and paperNumber will always be linked to that paper's EFTS. The inverse is not because EFTS isn't unique.
<li>EFTS → Points
<p> Yes both ways are valid the EFTS and Points will always be linked.
<li>Qualification → Salary
<p> No for both they don't depend on each other.
<li>BirthDate → Age
<p> Yes both ways are valid. 
</ul>
</ol>