package org.omg.IOP;


/**
* org/omg/IOP/TaggedProfile.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u181/11358/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, July 7, 2018 4:03:12 AM PDT
*/

public final class TaggedProfile implements org.omg.CORBA.portable.IDLEntity
{

  /** The tag, represented as a profile id. */
  public int tag = (int)0;

  /** The associated profile data. */
  public byte profile_data[] = null;

  public TaggedProfile ()
  {
  } // ctor

  public TaggedProfile (int _tag, byte[] _profile_data)
  {
    tag = _tag;
    profile_data = _profile_data;
  } // ctor

} // class TaggedProfile
