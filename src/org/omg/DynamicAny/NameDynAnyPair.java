package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, December 11, 2019 10:23:05 AM UTC
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
        * The name associated with the DynAny.
        */
  public String id = null;

  /**
        * The DynAny value associated with the name.
        */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair
