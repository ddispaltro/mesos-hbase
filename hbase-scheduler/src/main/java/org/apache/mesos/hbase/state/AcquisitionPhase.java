package org.apache.mesos.hbase.state;

/**
 * Defines node types.
 */
public enum AcquisitionPhase {

  /**
   * Waits here for the timeout on (re)registration.
   */
  RECONCILING_TASKS,

  /**
   * Launches the both namenodes.
   */
  START_NAME_NODES,

  /**
   * Formats both namenodes (first with initialize, second with bootstrap.
   */
  FORMAT_NAME_NODES,

  /**
   * If everything is healthy the scheduler stays here and tries to launch
   * datanodes on any slave that doesn't have an hdfs task running on it.
   */
  DATA_NODES
}
