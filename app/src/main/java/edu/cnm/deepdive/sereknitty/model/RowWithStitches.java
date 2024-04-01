package edu.cnm.deepdive.sereknitty.model;

import androidx.room.Relation;
import edu.cnm.deepdive.sereknitty.model.entity.Row;
import edu.cnm.deepdive.sereknitty.model.entity.RowStitch;
import java.util.List;

/**
 * This POJO is a class that allows for a multi-table join allowing me to recall the
 * {@code stitches} associated with a particular {@link Row} instance. It is not entity, but it
 * allows for more complicated queries without complicated SQL code.
 */
public class RowWithStitches extends Row {

  @Relation(entityColumn = "row_id", parentColumn = "row_id")
  private List<RowStitch> stitches;

  /**
   * This getter gets the {@link List} of stitches associated with a particular {@link Row}.
   */
  public List<RowStitch> getStitches() {
    return stitches;
  }

  /**
   * This setter sets the {@link List} of stitches associates with a particular {@link Row}.
   */
  public void setStitches(List<RowStitch> stitches) {
    this.stitches = stitches;
  }
}
