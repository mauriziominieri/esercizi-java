package question80;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: Da verificare meglio
Which two can be considered good practices for serializing Java objects?
    1. Ensure that the class definition used is the same as the class definition used by Java runtime at the time when the object was serialized.
    2. Implement secure serialization by generating secure object hash or using encryption.
 */
/*
1. Ensure that the class definition used is the same as the class definition used by Java runtime at the time when the object was serialized.
2. Implement secure serialization by generating secure object hash or using encryption.
3. Always override the readObject/writeObject methods from the java.io.Serializable interface.
4. Implement serialization for long-term data storage.
5. Assign null value by default while serializing and deserializing a transient variable.

It's considered a good practice to ensure that the class definition used is the same as the class definition used by Java runtime at the time when the object was serialized, as it will prevent errors that may occur when deserializing the object with a different class definition.
Also it is important to implement a secure serialization mechanism, such as generating secure object hash or using encryption, to prevent unauthorized access to the serialized data.

Option 3. is not a good practice because if these methods are not needed for the specific use case, it is not necessary to override them and it could be a security risk if not handled properly.
Option 4. is not a good practice because serialization is not designed for long-term storage, it is used for short-term data transfer.
Option 5. is not a good practice, rather than assigning null, the object should be initialized with default values.
 */
public class Main {}