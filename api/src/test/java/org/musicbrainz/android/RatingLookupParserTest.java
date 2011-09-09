package org.musicbrainz.android;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.musicbrainz.android.api.ws.ResponseParser;

public class RatingLookupParserTest extends BaseXmlParsingTestCase {

	@Test
    public void testRatingLookupFromArtist() {
		parseRatingAssertExpected("ratingLookup_artist_b10bbbfc-cf9e-42e0-be17-e2c3e1d2600d.xml", 4.7f);
    }
	
	@Test
	public void testRatingLookupFromReleaseGroup() {
		parseRatingAssertExpected("ratingLookup_release-group_bc7630eb-521a-3312-a281-adfb8c5aac7d.xml", 4f);
	}
	
	private void parseRatingAssertExpected(String xmlFile, float expected) {
		InputStream stream = getFileStream(xmlFile);
		assertNotNull(stream);
		
		try {
			ResponseParser responseParser = getResponseParser();
			float actual = responseParser.parseRatingLookup(stream);
			assertEquals(expected, actual, 0.01);
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			fail();
		}
	}

}
