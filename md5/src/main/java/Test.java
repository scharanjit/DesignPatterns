import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {


    public static void main(String[] args) throws NoSuchAlgorithmException {
//        String hash = "35454B055CC325EA1AF2126E27707052";
        String hash = "995CE7195147CFBF05DDCA1F0143EB90";
        String password = "{\n" +
                "    \"messageHeader\": {\n" +
                "        \"msgID\": \"1234\",\n" +
                "        \"msgType\": \"ORM^O01\",\n" +
                "        \"practiceID\": \"JOHNLA\"\n" +
                "        \n" +
                "    },\n" +
                "    \"patient\": {\n" +
                "        \"firstName\": \"Udibaba\",\n" +
                "        \"lastName\": \"G2\",\n" +
                "        \"middleName\": null,\n" +
                "        \"dob\": \"1990-09-26\",\n" +
                "        \"maritalStatus\": \"MA\",\n" +
                "        \"gender\": \"M\",\n" +
                "        \"suffix\": \"aa\",\n" +
                "        \"title\": \"sr.soft\",\n" +
                "        \"maidenName\": \"testmaiden\",\n" +
                "        \"aliasName\": \"Mr\",\n" +
                "        \"email\": \"jamesgosling@gmail.com\",\n" +
                "        \"homeNumber\": \"123-123-1234\",\n" +
                "        \"workNumber\": \"123-123-5432\",\n" +
                "        \"workNumberExt\": \"12345\",\n" +
                "        \"ssn\": \"123-45-6789\",\n" +
                "        \"primaryLanguage\": \"ar\",\n" +
                "        \"secondaryLanguage\": \"bn\",\n" +
                "        \"race\": \"I\",\n" +
                "        \"ethnicity\": \"TURK\",\n" +
                "        \"externalPatientId\": \"EXT1234\",\n" +
                "        \"patientIdentifier\": \"PAT1234\",\n" +
                "        \"medicalRecordNumber\": \"MRN1234566\",\n" +
                "        \"studyIdentifier\": \"STD1234\",\n" +
                "        \"deceased\": true,\n" +
                "        \"deceasedOn\": \"09-26-2009\",\n" +
                "        \"notes\": [\n" +
                "            \"samplenotes\",\n" +
                "            \"samplenotes\",\n" +
                "            \"samplenotes\"\n" +
                "        ],\n" +
                "        \"address\": [\n" +
                "            {\n" +
                "                \"sequence\": 1,\n" +
                "                \"addressLine1\": \"krishnanagar\",\n" +
                "                \"addressLine2\": \"yousufguda\",\n" +
                "                \"city\": \"ABCD\",\n" +
                "                \"state\": \"VT\",\n" +
                "                \"country\": \"VN\",\n" +
                "                \"zipCode\": \"500045\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sequence\": 2,\n" +
                "                \"addressLine1\": \"pramatitechnologies\",\n" +
                "                \"addressLine2\": \"vengalraopark\",\n" +
                "                \"city\": \"Hyderabad\",\n" +
                "                \"state\": \"WY\",\n" +
                "                \"country\": \"ZM\",\n" +
                "                \"zipCode\": \"500034\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"patientVisit\": {\n" +
                "        \"referringProvider\": [\n" +
                "            {\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-7\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Bethelen\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1063515856\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"J.\"\n" +
                "            },\n" +
                "\t\t\t{\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-8\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"location\": \"FLFCB-1\"\n" +
                "    },\n" +
                "    \"orderGroup\": {\n" +
                "        \"commonOrder\": {\n" +
                "\t\t\t\"accessionId\": \"123456\",\n" +
                "            \"orderDate\": \"2018-04-02T22:15:36\",\n" +
                "            \"orderControl\": \"NW\",\n" +
                "            \"customerOrderID\": \"18000677\",\n" +
                "            \"orderingProvider\": {\n" +
                "                \"customerProviderId\": \"CUST1234_ORC-12/OBR-16\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"observationRequests\": [\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"DNANS281\",\n" +
                "                \"serviceIdentifierDescription\": \"Expanded Carrier Screen (281)\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenCollectionDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000621\",\n" +
                "                \"reason\": \"ABAM\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.03\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.05\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"CYTPB\",\n" +
                "                \"serviceIdentifierDescription\": \"CHROMOSOME ANALYSIS PERIPHERAL BLOOD\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenObservationDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000622\",\n" +
                "                \"reason\": \"ABN\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.1\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.9\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"insurances\": [\n" +
                "        {\n" +
                "            \"sequence\": 1,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-27-2018\",\n" +
                "            \"expirationDate\": \"09-27-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sequence\": 2,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-26-2018\",\n" +
                "            \"expirationDate\": \"09-26-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        }\n" +
                "    ]\n" +
                "}\n" +
                "        ],\n" +
                "        \"address\": [\n" +
                "            {\n" +
                "    \"messageHeader\": {\n" +
                "        \"msgID\": \"1234\",\n" +
                "        \"msgType\": \"ORM^O01\",\n" +
                "        \"practiceID\": \"JOHNLA\"\n" +
                "        \n" +
                "    },\n" +
                "    \"patient\": {\n" +
                "        \"firstName\": \"Udibaba\",\n" +
                "        \"lastName\": \"G2\",\n" +
                "        \"middleName\": null,\n" +
                "        \"dob\": \"1990-09-26\",\n" +
                "        \"maritalStatus\": \"MA\",\n" +
                "        \"gender\": \"M\",\n" +
                "        \"suffix\": \"aa\",\n" +
                "        \"title\": \"sr.soft\",\n" +
                "        \"maidenName\": \"testmaiden\",\n" +
                "        \"aliasName\": \"Mr\",\n" +
                "        \"email\": \"jamesgosling@gmail.com\",\n" +
                "        \"homeNumber\": \"123-123-1234\",\n" +
                "        \"workNumber\": \"123-123-5432\",\n" +
                "        \"workNumberExt\": \"12345\",\n" +
                "        \"ssn\": \"123-45-6789\",\n" +
                "        \"primaryLanguage\": \"ar\",\n" +
                "        \"secondaryLanguage\": \"bn\",\n" +
                "        \"race\": \"I\",\n" +
                "        \"ethnicity\": \"TURK\",\n" +
                "        \"externalPatientId\": \"EXT1234\",\n" +
                "        \"patientIdentifier\": \"PAT1234\",\n" +
                "        \"medicalRecordNumber\": \"MRN1234566\",\n" +
                "        \"studyIdentifier\": \"STD1234\",\n" +
                "        \"deceased\": true,\n" +
                "        \"deceasedOn\": \"09-26-2009\",\n" +
                "        \"notes\": [\n" +
                "            \"samplenotes\",\n" +
                "            \"samplenotes\",\n" +
                "            \"samplenotes\"\n" +
                "        ],\n" +
                "        \"address\": [\n" +
                "            {\n" +
                "                \"sequence\": 1,\n" +
                "                \"addressLine1\": \"krishnanagar\",\n" +
                "                \"addressLine2\": \"yousufguda\",\n" +
                "                \"city\": \"ABCD\",\n" +
                "                \"state\": \"VT\",\n" +
                "                \"country\": \"VN\",\n" +
                "                \"zipCode\": \"500045\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sequence\": 2,\n" +
                "                \"addressLine1\": \"pramatitechnologies\",\n" +
                "                \"addressLine2\": \"vengalraopark\",\n" +
                "                \"city\": \"Hyderabad\",\n" +
                "                \"state\": \"WY\",\n" +
                "                \"country\": \"ZM\",\n" +
                "                \"zipCode\": \"500034\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"patientVisit\": {\n" +
                "        \"referringProvider\": [\n" +
                "            {\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-7\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Bethelen\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1063515856\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"J.\"\n" +
                "            },\n" +
                "\t\t\t{\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-8\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"location\": \"FLFCB-1\"\n" +
                "    },\n" +
                "    \"orderGroup\": {\n" +
                "        \"commonOrder\": {\n" +
                "\t\t\t\"accessionId\": \"123456\",\n" +
                "            \"orderDate\": \"2018-04-02T22:15:36\",\n" +
                "            \"orderControl\": \"NW\",\n" +
                "            \"customerOrderID\": \"18000677\",\n" +
                "            \"orderingProvider\": {\n" +
                "                \"customerProviderId\": \"CUST1234_ORC-12/OBR-16\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"observationRequests\": [\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"DNANS281\",\n" +
                "                \"serviceIdentifierDescription\": \"Expanded Carrier Screen (281)\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenCollectionDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000621\",\n" +
                "                \"reason\": \"ABAM\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.03\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.05\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"CYTPB\",\n" +
                "                \"serviceIdentifierDescription\": \"CHROMOSOME ANALYSIS PERIPHERAL BLOOD\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenObservationDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000622\",\n" +
                "                \"reason\": \"ABN\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.1\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.9\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"insurances\": [\n" +
                "        {\n" +
                "            \"sequence\": 1,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-27-2018\",\n" +
                "            \"expirationDate\": \"09-27-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sequence\": 2,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-26-2018\",\n" +
                "            \"expirationDate\": \"09-26-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        }\n" +
                "    ]\n" +
                "}\n" +
                "                \"sequence\": 1,\n" +
                "                \"addressLine1\": \"krishnanagar\",\n" +
                "                \"addressLine2\": \"yousufguda\",\n" +
                "                \"city\": \"ABCD\",\n" +
                "                \"state\": \"VT\",\n" +
                "                \"country\": \"VN\",\n" +
                "                \"zipCode\": \"500045\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sequence\": 2,\n" +
                "                \"addressLine1\": \"pramatitechnologies\",\n" +
                "                \"addressLine2\": \"vengalraopark\",\n" +
                "                \"city\": \"Hyderabad\",\n" +
                "                \"state\": \"WY\",\n" +
                "                \"country\": \"ZM\",\n" +
                "                \"zipCode\": \"500034\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"patientVisit\": {\n" +
                "        \"referringProvider\": [\n" +
                "            {\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-7\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Bethelen\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1063515856\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"J.\"\n" +
                "            },\n" +
                "\t\t\t{\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-8\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"location\": \"FLFCB-1\"\n" +
                "    },\n" +
                "    \"orderGroup\": {\n" +
                "        \"commonOrder\": {\n" +
                "\t\t\t\"accessionId\": \"123456\",\n" +
                "            \"orderDate\": \"2018-04-02T22:15:36\",\n" +
                "            \"orderControl\": \"NW\",\n" +
                "            \"customerOrderID\": \"18000677\",\n" +
                "            \"orderingProvider\": {\n" +
                "                \"customerProviderId\": \"CUST1234_ORC-12/OBR-16\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"observationRequests\": [\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"DNANS281\",\n" +
                "                \"serviceIdentifierDescription\": \"Expanded Carrier Screen (281)\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenCollectionDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000621\",\n" +
                "                \"reason\": \"ABAM\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.03\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.05\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"CYTPB\",\n" +
                "                \"serviceIdentifierDescription\": \"CHROMOSOME ANALYSIS PERIPHERAL BLOOD\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenObservationDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000622\",\n" +
                "                \"reason\": \"ABN\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.1\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.9\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"insurances\": [\n" +
                "        {\n" +
                "            \"sequence\": 1,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-27-2018\",\n" +
                "            \"expirationDate\": \"09-27-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sequence\": 2,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-26-2018\",\n" +
                "            \"expirationDate\": \"09-26-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        }\n" +
                "    ]\n" +
                "}\n" +
                "        \"firstName\": \"Udibaba\",\n" +
                "        \"lastName\": \"G2\",\n" +
                "        \"middleName\": null,\n" +
                "        \"dob\": \"1990-09-26\",\n" +
                "        \"maritalStatus\": \"MA\",\n" +
                "        \"gender\": \"M\",\n" +
                "        \"suffix\": \"aa\",\n" +
                "        \"title\": \"sr.soft\",\n" +
                "        \"maidenName\": \"testmaiden\",\n" +
                "        \"aliasName\": \"Mr\",\n" +
                "        \"email\": \"jamesgosling@gmail.com\",\n" +
                "        \"homeNumber\": \"123-123-1234\",\n" +
                "        \"workNumber\": \"123-123-5432\",\n" +
                "        \"workNumberExt\": \"12345\",\n" +
                "        \"ssn\": \"123-45-6789\",\n" +
                "        \"primaryLanguage\": \"ar\",\n" +
                "        \"secondaryLanguage\": \"bn\",\n" +
                "        \"race\": \"I\",\n" +
                "        \"ethnicity\": \"TURK\",\n" +
                "        \"externalPatientId\": \"EXT1234\",\n" +
                "        \"patientIdentifier\": \"PAT1234\",\n" +
                "        \"medicalRecordNumber\": \"MRN1234566\",\n" +
                "        \"studyIdentifier\": \"STD1234\",\n" +
                "        \"deceased\": true,\n" +
                "        \"deceasedOn\": \"09-26-2009\",\n" +
                "        \"notes\": [\n" +
                "            \"samplenotes\",\n" +
                "            \"samplenotes\",\n" +
                "            \"samplenotes\"\n" +
                "        ],\n" +
                "        \"address\": [\n" +
                "            {\n" +
                "                \"sequence\": 1,\n" +
                "                \"addressLine1\": \"krishnanagar\",\n" +
                "                \"addressLine2\": \"yousufguda\",\n" +
                "                \"city\": \"ABCD\",\n" +
                "                \"state\": \"VT\",\n" +
                "                \"country\": \"VN\",\n" +
                "                \"zipCode\": \"500045\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"sequence\": 2,\n" +
                "                \"addressLine1\": \"pramatitechnologies\",\n" +
                "                \"addressLine2\": \"vengalraopark\",\n" +
                "                \"city\": \"Hyderabad\",\n" +
                "                \"state\": \"WY\",\n" +
                "                \"country\": \"ZM\",\n" +
                "                \"zipCode\": \"500034\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"patientVisit\": {\n" +
                "        \"referringProvider\": [\n" +
                "            {\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-7\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Bethelen\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1063515856\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"J.\"\n" +
                "            },\n" +
                "\t\t\t{\n" +
                "                \"customerProviderId\": \"CUST1234_PV1-8\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"location\": \"FLFCB-1\"\n" +
                "    },\n" +
                "    \"orderGroup\": {\n" +
                "        \"commonOrder\": {\n" +
                "\t\t\t\"accessionId\": \"123456\",\n" +
                "            \"orderDate\": \"2018-04-02T22:15:36\",\n" +
                "            \"orderControl\": \"NW\",\n" +
                "            \"customerOrderID\": \"18000677\",\n" +
                "            \"orderingProvider\": {\n" +
                "                \"customerProviderId\": \"CUST1234_ORC-12/OBR-16\",\n" +
                "                \"firstName\": \"Johnson\",\n" +
                "                \"lastName\": \"Lauren\",\n" +
                "                \"middleName\": null,\n" +
                "                \"npi\": \"1588830822\",\n" +
                "                \"suffix\": null,\n" +
                "                \"title\": \"DR\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"observationRequests\": [\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"DNANS281\",\n" +
                "                \"serviceIdentifierDescription\": \"Expanded Carrier Screen (281)\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenCollectionDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000621\",\n" +
                "                \"reason\": \"ABAM\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.03\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A01.05\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"serviceIdentifier\": \"CYTPB\",\n" +
                "                \"serviceIdentifierDescription\": \"CHROMOSOME ANALYSIS PERIPHERAL BLOOD\",\n" +
                "                \"specimen\": \"BLD\",\n" +
                "                \"specimenDescription\": \"Blood\",\n" +
                "                \"specimenObservationDateTime\": \"2018-04-02 22:15:36\",\n" +
                "                \"customerOrderID\": \"18000677\",\n" +
                "                \"labNumber\": \"18000622\",\n" +
                "                \"reason\": \"ABN\",\n" +
                "                \"diagnosis\": [\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.1\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"diagnosisCode\": \"A00.9\",\n" +
                "                        \"diagnosisDescription\": \"Encounter for this or that\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"notes\": [\n" +
                "                    \"This is note line 1\",\n" +
                "                    \"note line 2\"\n" +
                "                ],\n" +
                "                \"observations\": [\n" +
                "                    {\n" +
                "                        \"code\": \"age\",\n" +
                "                        \"codeDescription\": \"How old is the patient?\",\n" +
                "                        \"value\": \"25\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"gender\",\n" +
                "                        \"codeDescription\": \"Patient's Gender\",\n" +
                "                        \"value\": \"male\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"code\": \"pregnant\",\n" +
                "                        \"codeDescription\": \"Is the patient pregnant?:\",\n" +
                "                        \"value\": \"Yes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"insurances\": [\n" +
                "        {\n" +
                "            \"sequence\": 1,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-27-2018\",\n" +
                "            \"expirationDate\": \"09-27-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sequence\": 2,\n" +
                "            \"name\": \"UnitedInsurance\",\n" +
                "            \"effectiveDate\": \"09-26-2018\",\n" +
                "            \"expirationDate\": \"09-26-2028\",\n" +
                "            \"employmentStatus\": \"Employed\",\n" +
                "            \"employer\": \"pramatitech\",\n" +
                "            \"groupNo\": \"GRP1234\",\n" +
                "            \"policyNo\": \"POLICY1234\",\n" +
                "            \"insuranceAddressLine1\": \"nanalnagar\",\n" +
                "            \"insuranceAddressLine2\": \"mehdipatnam\",\n" +
                "            \"insuranceCity\": \"ABCD\",\n" +
                "            \"insuranceState\": \"VT\",\n" +
                "            \"insuranceCountry\": \"ZM\",\n" +
                "            \"insuranceZipCode\": \"500054\",\n" +
                "            \"holderName\": \"JAMESGOSLING-SELF\",\n" +
                "            \"holderRelation\": \"SELF\",\n" +
                "            \"holderGender\": \"M\",\n" +
                "            \"holderDob\": \"09-26-1990\",\n" +
                "            \"homeAddressLine1\": \"srikrishnanagar\",\n" +
                "            \"homeAddressLine2\": \"yousufguda\",\n" +
                "            \"homeCity\": \"ABCDE\",\n" +
                "            \"homeState\": \"TX\",\n" +
                "            \"homeCountry\": \"VI\",\n" +
                "            \"homeZipCode\": \"500045\",\n" +
                "            \"workAddressLine1\": \"pramatitech\",\n" +
                "            \"workAddressLine2\": \"nearvengalraopark\",\n" +
                "            \"workCity\": \"ABCD\",\n" +
                "            \"workState\": \"VA\",\n" +
                "            \"workCountry\": \"YE\",\n" +
                "            \"workZipCode\": \"500034\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter
                .printHexBinary(digest).toUpperCase();

        System.out.println(myHash.length());

        System.out.println(myHash.equals(hash));

    }


}
