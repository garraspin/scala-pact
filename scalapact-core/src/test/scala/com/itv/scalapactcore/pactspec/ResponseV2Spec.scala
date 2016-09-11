package com.itv.scalapactcore.pactspec

import com.itv.scalapactcore.pactspec.util.PactSpecTester


class ResponseV2Spec extends PactSpecTester {

  val pactSpecVersion = "2"

  describe("Exercising response V2 Pact Specification match tests") {

    it("should check the response status specs") {
      testSpecs(
        List(
          fetchSpec("/response/status/different status.json"),
          fetchSpec("/response/status/matches.json")
        )
      )
    }

    it("should check the response header specs") {
      testSpecs(
        List(
          fetchSpec("/response/headers/empty headers.json"),
          fetchSpec("/response/headers/header name is different case.json"),
          fetchSpec("/response/headers/header value is different case.json"),
          fetchSpec("/response/headers/matches.json"),
          fetchSpec("/response/headers/order of comma separated header values different.json"),
          fetchSpec("/response/headers/unexpected header found.json"),
          fetchSpec("/response/headers/whitespace after comma different.json")
        )
      )
    }

    it("should check the response header specs with regex") {
      testSpecs(
        List(
          fetchSpec("/response/headers/matches with regex.json")
        )
      )
    }

    it("should check the response body specs") {
      testSpecs(
        List(
//          fetchSpec("/response/body/additional property with type matcher.json"),
//          fetchSpec("/response/body/array at top level with matchers.json"),
          fetchSpec("/response/body/array at top level.json"),
          //fetchSpec("/response/body/array in different order.json"), // DO NOT AGREE WITH THIS ONE
//          fetchSpec("/response/body/array with regex matcher.json"),
//          fetchSpec("/response/body/array with type matcher mismatch.json"),
//          fetchSpec("/response/body/array with type matcher.json"),
          fetchSpec("/response/body/deeply nested objects.json"),
          fetchSpec("/response/body/different value found at index.json"),
          fetchSpec("/response/body/different value found at key.json"),
          fetchSpec("/response/body/keys out of order match.json"),
//          fetchSpec("/response/body/matches with regex.json"),
//          fetchSpec("/response/body/matches with type.json"),
          fetchSpec("/response/body/matches.json"),
          fetchSpec("/response/body/missing body.json"),
          fetchSpec("/response/body/missing index.json"),
          fetchSpec("/response/body/missing key.json"),
          fetchSpec("/response/body/no body no content type.json"),
          fetchSpec("/response/body/not null found at key when null expected.json"),
          fetchSpec("/response/body/not null found in array when null expected.json"),
          fetchSpec("/response/body/null found at key where not null expected.json"),
          fetchSpec("/response/body/null found in array when not null expected.json"),
          fetchSpec("/response/body/number found at key when string expected.json"),
          fetchSpec("/response/body/number found in array when string expected.json"),
          //fetchSpec("/response/body/objects in array first matches.json"),
//          fetchSpec("/response/body/objects in array no matches.json"),
//          fetchSpec("/response/body/objects in array second matches.json"),
//          fetchSpec("/response/body/objects in array type matching.json"),
//          fetchSpec("/response/body/objects in array with type mismatching.json"),
          fetchSpec("/response/body/plain text that does not match.json"),
          fetchSpec("/response/body/plain text that matches.json"),
          fetchSpec("/response/body/property name is different case.json"),
          fetchSpec("/response/body/string found at key when number expected.json"),
          fetchSpec("/response/body/string found in array when number expected.json"),
          //fetchSpec("/response/body/unexpected index with not null value modified.json"), // DO NOT AGREE WITH THIS ONE
          //fetchSpec("/response/body/unexpected index with null value modified.json"), // DO NOT AGREE WITH THIS ONE
          fetchSpec("/response/body/unexpected key with not null value.json"),
          fetchSpec("/response/body/unexpected key with null value.json")
        )
      )
    }
  }

}
