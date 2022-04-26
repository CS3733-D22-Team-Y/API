package edu.wpi.cs3733.d22.teamY.api;

import edu.wpi.cs3733.d22.teamY.api.Model.Employee;
import edu.wpi.cs3733.d22.teamY.api.Model.Location;
import edu.wpi.cs3733.d22.teamY.api.Model.SecurityService;
import edu.wpi.cs3733.d22.teamY.api.Model.StringArrayConv;

public enum EntryType {

  // Place all new entry types here.
  // In order: specify number of columns, CSV import path, CSV export path,
  // and actual entry class.

  // Remember! For something to qualify as an entry, it must implement StringArrayConv
  // as this ensures that it's a type that can be properly formatted for CSV.

  LOCATION(8, "CSVs/TowerLocations", "Export_CSVs/locations_export", Location.class),

  EMPLOYEE(5, "CSVs/Employees", "Export_CSVs/employees_export", Employee.class),

  SECURITY_SERVICE_REQUEST(
      5,
      "SecurityServiceRequests",
      "Export_CSVs/securityServiceRequests_export",
      SecurityService.class),

// region Enum Data / Methods
/* Enum specification begins below... */ ;

  private final int columns;
  private final String csvInLocation;
  private final String csvOutLocation;
  private final Class<? extends StringArrayConv> type;

  <T extends StringArrayConv> EntryType(int cols, String inPath, String outPath, Class<T> cls) {
    columns = cols;
    csvInLocation = inPath;
    csvOutLocation = outPath;
    type = cls;
  }

  // Returns number of columns in this type.
  public int getColumns() {
    return columns;
  }

  // Returns CSV input path for this type.
  public String getCsvInputLocation() {
    return csvInLocation;
  }

  // Returns CSV output path for this type.
  public String getCsvOutputLocation() {
    return csvOutLocation;
  }

  // Returns actual class for this type.
  public Class<? extends StringArrayConv> getEntryClass() {
    return type;
  }

  // Returns the entry type tied to the input class (if any).
  public static EntryType getFromClass(Class<? extends StringArrayConv> cls) {
    for (EntryType et : EntryType.values()) {
      if (et.getEntryClass() == cls) {
        return et;
      }
    }

    return null;
  }
  // endregion
}
