package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/CurrentOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, December 11, 2019 10:23:05 AM UTC
*/


/**
   * Portable Interceptors Current (also known as <code>PICurrent</code>) 
   * is merely a slot table, the slots of which are used by each service to 
   * transfer their context data between their context and the request's or 
   * reply's service context. Each service which wishes to use PICurrent 
   * reserves a slot or slots at initialization time and uses those slots 
   * during the processing of requests and replies.
   * <p>
   * Before an invocation is made, PICurrent is obtained via a call to 
   * <code>ORB.resolve_initial_references( "PICurrent" )</code>. From within 
   * the interception points, the data on PICurrent that has moved from the 
   * thread scope to the request scope is available via the 
   * <code>get_slot</code> operation on the <code>RequestInfo</code> object. 
   * A PICurrent can still be obtained via 
   * <code>resolve_initial_references</code>, but that is the Interceptor's 
   * thread scope PICurrent.
   */
public interface CurrentOperations  extends org.omg.CORBA.CurrentOperations
{

  /**
     * Retrieves the slot data the application set in PICurrent via 
     * <code>get_slot</code>.  The data is in the form of an Any. 
     * <p>
     * If the given slot has not been set, an Any containing a type code 
     * with a <code>TCKind</code> value of <code>tk_null</code> and no value 
     * is returned. 
     *
     * @param id The <code>SlotId</code> of the slot from which the data will 
     *     be returned. 
     * @return The data, in the form of an Any, of the given slot identifier.
     * @exception InvalidSlot thrown if get_slot is called on a slot that 
     *     has not been allocated. 
     * @exception BAD_INV_ORDER thrown if <code>get_slot</code> is called 
     *     from within an ORB initializer 
     */
  org.omg.CORBA.Any get_slot (int id) throws org.omg.PortableInterceptor.InvalidSlot;

  /**
     * Sets data in a slot. The data is in the form of an Any. If data 
     * already exists in that slot, it is overridden. 
     *
     * @param id The <code>SlotId</code> of the slot to which the data will 
     *     be set. 
     * @param data The data, in the form of an Any, which will be set 
     *     to the identified slot. 
     * @exception InvalidSlot thrown if <code>set_slot</code> is called on 
     *     a slot that has not been allocated.
     * @exception BAD_INV_ORDER thrown if <code>set_slot</code> is called 
     *     from within an ORB initializer. 
     */
  void set_slot (int id, org.omg.CORBA.Any data) throws org.omg.PortableInterceptor.InvalidSlot;
} // interface CurrentOperations
