package com.tightvnc.vncviewer;

import java.io.IOException;

//
// This interface will be used for recording sessions
// by decoders classes in com.tighvnc.decoder package.
//
public interface RecordInterface {
  //
  // Recording state methods
  //
  public boolean isRecordFromBeginning();
  public boolean canWrite();

  //
  // Write data methods
  //
  public void write(byte b[]) throws IOException;
  public void write(byte b[], int off, int len) throws IOException;
  public void writeByte(byte b) throws IOException;
  public void writeByte(int i) throws IOException;
  public void writeIntBE(int v) throws IOException;
  public void recordCompactLen(int len) throws IOException;
  public void recordCompressedData(byte[] data) throws IOException;
}
