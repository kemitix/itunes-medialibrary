package net.kemitix.itunes.medialibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class ArtistRowMapperTest {

    private ArtistRowMapper rowMapper;

    @Before
    public void setUp() {
        rowMapper = new ArtistRowMapper();
    }

    /**
     * Test of mapRow method, of class ArtistRowMapper.
     *
     * @throws java.sql.SQLException
     */
    @Test
    public void testMapRow() throws SQLException {
        //given
        ResultSet resultSet = mock(ResultSet.class);
        int rowNum = 3;
        long id = 12345l;
        when(resultSet.getLong("album_artist_pid")).thenReturn(id);

        //when
        Artist artist = rowMapper.mapRow(resultSet, rowNum);

        //then
        Assert.assertEquals(id, artist.getId());
    }

}
