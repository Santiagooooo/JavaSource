package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/NoServant.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 11, 2019 10:23:07 AM UTC
*/

public final class NoServant extends org.omg.CORBA.UserException
{

  public NoServant ()
  {
    super(NoServantHelper.id());
  } // ctor


  public NoServant (String $reason)
  {
    super(NoServantHelper.id() + "  " + $reason);
  } // ctor

} // class NoServant
