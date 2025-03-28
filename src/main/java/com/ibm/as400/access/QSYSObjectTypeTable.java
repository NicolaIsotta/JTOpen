///////////////////////////////////////////////////////////////////////////////
//
// JTOpen (IBM Toolbox for Java - OSS version)
//
// Filename: QSYSObjectTypeTable.java
//
// The source code contained herein is licensed under the IBM Public License
// Version 1.0, which has been approved by the Open Source Initiative.
// Copyright (C) 1997-2004 International Business Machines Corporation and
// others. All rights reserved.
//
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

import java.util.Hashtable;
import java.util.MissingResourceException;
import java.util.Vector;



/**
Maintains a list of object types
and extended attributes for objects on the system.

<p>For example, to list all possible extended attributes for
the "FILE" object type.
<pre><code>
String[] extendedAttributes = QSYSObjectTypeTable.getSupportedAttributes("FILE");
for(int i = 0; i &lt; extendedAttributes.length; ++i)
{
System.out.println(QSYSObjectTypeTable.getLocalizedObjectType("FILE", extendedAttributes[i]));
}
</code></pre>
**/
//
// Implementation notes:
//
// This is the master list and is used by Operations Navigator.
// It was generated by a DCG-approved list.
// For each type and attribute in this table, there needs to
// be a corresponding string in MRI.java.
//
public class QSYSObjectTypeTable
{
    private static final String[] noAttributes_ = new String[0];
    private static Hashtable table_ = new Hashtable();
    private static Vector typesAsVector_ = new Vector();
    private static String[] types_ = null;
    private static Vector userDefinedAttributesAllowed_ = new Vector();             // @A1A

    // Note: The following types occur only in IFS, not in QSYS:
    /*
     BLKSF
     CHRSF
     DDIR
     DIR
     DSTMF
     FIFO
     NWSSTG
     SOCKET
     STMF
     SYMLNK
     */


    static
    {
        add("ALRTBL");
        add("AUTL");
        add("BLKSF");  // this type does not occur in QSYS
        add("BNDDIR");
        add("CFGL", new String[] { "", "APPNDIR", "APPNLCL", "APPNRMT", "APPNSSN", "ASYNCADR", "ASYNCLOC", "SNAPASTHR" });
        add("CHTFMT");
        add("CHRSF");  // this type does not occur in QSYS
        add("CLD");
        add("CLS");
        add("CMD");
        add("CNNL");
        add("COSD");
        add("CRG");
        add("CRQD");
        add("CSI");
        add("CSPMAP");
        add("CSPTBL");
        add("CTLD", new String[] { "", "APPC", "ASC", "BSC", "FNC", "HOST", "LWS", "NET", "RTL", "RWS", "TAP", "VNM", "VWS" });   //@550C
        add("DDIR");  // this type does not occur in QSYS
        add("DEVD", new String[] { "", "APPC", "ASC", "ASP", "BSC", "CRP", "DKT", "DSPLCL", "DSPRMT", "DSPSNP", "DSPVRT", "FNC", "HOST", "INTR", "MLB", "NET", "OPT", "PRTLCL", "PRTLAN", "PRTRMT", "PRTSNP", "PRTVRT", "RTL", "SNPTUP", "SNPTDN", "SNUF", "TAP" });
        add("DIR");  // this type does not occur in QSYS
        add("DOC");
        add("DSTMF");  // this type does not occur in QSYS
        add("DTAARA");
        add("DTADCT");
        add("DTAQ", new String[] { "", "DDMDTAQUE" });
        add("EDTD");
        add("EXITRG");
        add("FCT");
        add("FIFO");  // this type does not occur in QSYS
        add("FILE", new String[] { "", "PF", "LF", "BSCF38", "CMNF38", "CRDF38", "DFU", "DFUEXC", "DFUNOTEXC", "DSPF", "DSPF36", "DSPF38", "DDMF", "DKTF", "ICFF", "LF38", "MXDF38", "PF38", "PRTF", "PRTF38", "SAVF", "TAPF" });
        add("FLR");
        add("FNTRSC", new String[] { "", "CDEFNT", "FNTCHRSET", "CDEPAG" });
        add("FNTTBL");
        add("FORMDF");
        add("FTR", new String[] { "", "ALR", "PRB" });
        add("GSS", new String[] { "", "VSS", "ISS" });
        add("IGCDCT");
        add("IGCSRT");
        add("IGCTBL");
        add("IMGCLG");                                                   // @M2a
        add("IPXD");
        add("JOBD");
        add("JOBQ");
        add("JOBSCD");
        add("JRN");
        add("JRNRCV");
        add("LIB", new String[] { "", "PROD", "TEST" });
        add("LIND", new String[] { "", "ASC", "BSC", "DDI", "ETH", "FAX", "FR", "IDLC", "NET", "PPP", "SDLC", "TDLC", "TRN", "WLS", "X25" });
        add("LOCALE");
        add("MEDDFN");
        add("MENU", new String[] { "", "UIM", "DSPF", "PGM" });
        add("MGTCOL", new String[] { "", "PFR", "PFRHST", "PFRDTL" });
        add("MODD");
        add("MODULE", new String[] { "", "CLE", "CLLE", "RPGLE", "CBLLE", "CPPLE" });
        add("MSGF");
        add("MSGQ");
        add("M36");
        add("M36CFG");
        add("NODGRP");
        add("NODL");
        add("NTBD");
        add("NWID", new String[] { "", "ATM", "FR", "ISDN" });
        add("NWSCFG");
        add("NWSD", new String[] { "", "GUEST", "IXSVR", "WINDOWSNT" });    //@550C
        add("OUTQ");
        add("OVL");
        add("PAGDFN");
        add("PAGSEG");
        add("PDFMAP");  //@K1A
        add("PDG");
        add("PGM", new String[] { "", "ASM38", "BAS", "BAS38", "C", "CBL", "CBLLE", "CBL36", "CBL38",
                                  "CLE", "CLLE", "CLP", "CLP38", "CPPLE", "CSP", "DFU", "DFUEXC",
                                  "DFUNOTEXC", "FTN", "PAS", "PAS38", "PLI", "PLI38", "RMC", "RPG",
                                  "RPGLE", "RPG36", "RPG38" });
        add("PNLGRP");
        add("PRDAVL");
        add("PRDDFN");
        add("PRDLOD");
        add("PSFCFG");
        add("QMFORM", new String[] { "", "QUERYMGR" });
        add("QMQRY", new String[] { "PROMPT", "SQL" });
        add("QRYDFN", new String[] { "", "QRY" });
        add("RCT");
        add("SBSD");    // @D1c (was originally commended out under @A1d)
        add("SCHIDX");
        add("SOCKET");  // this type does not occur in QSYS
        add("SPADCT", new String[] { "", "AFRIKAAN", "AKTUEEL", "BRASIL", "CATALA", "DANSK",
                                     "DEUTSCH", "DEUTSCH2", "DSCHWEIZ", "ESPANA", "FRANCAIS",
                                     "FRA2", "GREEK", "ISLENSK", "ITALIANO", "LEGAL", "MEDICAL",
                                     "NEDERLND", "NEDPLUS", "NORBOK", "NORNYN", "PORTUGAL",
                                     "RUSSIAN", "SUOMI", "SVENSK", "UK", "US" });
        add("SQLPKG");
        add("SQLXSR");  // v7r1
        add("SQLUDT");
        add("SRVPGM", new String[] { "", "CLE", "CLLE", "RPGLE", "CBLLE", "CPPLE" });
        add("SSND");
        add("STMF");    // this type does not occur in QSYS
        add("SVRSTG");
        add("SYMLNK");  // this type does not occur in QSYS
        add("S36");
        add("TBL");
        add("TIMZON");  //@K1A
        add("USRIDX");
        add("USRPRF");
        add("USRQ");
        add("USRSPC");
        add("VLDL");
        add("WSCST");

        types_ = new String[typesAsVector_.size()];
        typesAsVector_.copyInto(types_);

        userDefinedAttributesAllowed_.addElement("USRIDX");             // @A1A
        userDefinedAttributesAllowed_.addElement("USRQ");               // @A1A
        userDefinedAttributesAllowed_.addElement("USRSPC");             // @A1A
    }



    private static void add(String type)
    {
        add(type, noAttributes_);
    }



    private static void add(String type, String[] attributes)
    {
        typesAsVector_.addElement(type);
        table_.put(type, attributes);
    }



    // No need to be able to instantiate this object.
    private QSYSObjectTypeTable() { }


/**
Returns a localized description of an object type.

@param type                 The object type.
@return The localized description.
**/
    public static String getLocalizedObjectType(String type)
    {
        return getLocalizedObjectType(type, null);
    }



/**
Returns a localized description of an object type.

@param type                 The object type.
@param attribute            The extended attribute, or null if none.
@return                     The localized description, or the type name
                            if no localized desription can be determined.
**/
//
// Design note:  I thought about allowing attribute == "" to mean
//               the same thing as null, but I decided against it, in case
//               we ever need to differentiate between a type with no
//               attribute and a type with an attribute not specified
//               (i.e. <blank>).
//
    public static String getLocalizedObjectType(String type, String attribute)
    {
        if (type == null)
            throw new NullPointerException("type");

        // First let's get the string for the type, then tack on the attribute
        // if needed.
        StringBuilder localized = new StringBuilder();
        // Concoct the MRI key.
        StringBuilder buffer = new StringBuilder();
        buffer.append("TYPE_");

        // Add the type.  Uppercase it and remove a * if included in the first character.
        type = type.trim().toUpperCase();                                                   // @A1A
        if (type.length() > 0) {
            if (type.charAt(0) == '*') {
                if (type.length() > 1)                                                      // @A1C
                    type = type.substring(1);                                               // @A1C
                else
                    throw new ExtendedIllegalArgumentException("type(" + type + ")",
                        ExtendedIllegalArgumentException.PARAMETER_VALUE_NOT_VALID);
            }
            buffer.append(type);                                                            // @A1C
        }                                                                                   // @A1C
        else                                                                                // @A1A
            throw new ExtendedIllegalArgumentException("type(" + type + ")",                // @A1A
                ExtendedIllegalArgumentException.PARAMETER_VALUE_NOT_VALID);                // @A1A

        // Get the MRI for the type.                                                        // @A1C
        String mriKey = buffer.toString();
        try {
            localized.append(ResourceBundleLoader.getText(mriKey));
        }
        catch(MissingResourceException e) {
            localized.append(type);
        }

        // Add the attribute if included.
        if (attribute != null) {
            String attributeOriginalCase = attribute.trim();                                // @A1A
            attribute = attributeOriginalCase.toUpperCase();                                // @A1A
            if (attribute.length() > 0) {                                                   // @A1C
                buffer.append('_');
                buffer.append(attribute.toUpperCase());
                mriKey = buffer.toString();
                try {
                    String attributeText = ResourceBundleLoader.getText(mriKey);
                    if (attributeText.length() > 0) {                                       // @A1A
                        localized.append(" - ");
                        localized.append(attributeText);
                    }                                                                       // @A1A
                }
                catch(MissingResourceException e) {
                    // The attribute was not found.  For the types where                       @A1C
                    // <user-defined> is allowed, we will add the attribute as                 @A1A
                    // it is specified.  For all others, we will just return the               @A1A
                    // type with no hyphen.  This accounts for <other>.                        @A1A
                    if (userDefinedAttributesAllowed_.contains(type)) {                     // @A1A
                        localized.append(" - ");                                            // @A1A
                        localized.append(attributeOriginalCase);                            // @A1A
                    }                                                                       // @A1A
                }
            }                                                                               // @A1A
        }

        return localized.toString();
    }




/**
Returns a list of the supported extended attributes for an object type.

@param type                 The object type.
@return The list of the supported extended attributes.
**/
    public static String[] getSupportedAttributes(String type)
    {
        if (!table_.containsKey(type))
            throw new ExtendedIllegalArgumentException("type(" + type + ")",
                ExtendedIllegalArgumentException.PARAMETER_VALUE_NOT_VALID);
        else
            return (String[])table_.get(type);
    }



/**
Returns a list of the supported object types.

@return The list of the supported object types.
**/
    public static String[] getSupportedObjectTypes()
    {
      String[] types = null;
      if (types_ != null)
      {
        // Create a copy, so as not to expose internal representation.
        types = new String[types_.length];
        System.arraycopy(types_, 0, types, 0, types_.length);
      }
      return types;
    }



}



