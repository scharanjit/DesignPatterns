package debugging;

public class YoutubeNotplayingtheSelectedVideo {
}


/**
 *
 * Youtube is not playing the selected video.
 * What could be the problem and how to debug this issue?
 *
 *
 * Youtube uses adobe flash player,

 1. adobe flash player crashed
 2. adobe flash player incompatible with browser through which you are playing youtube video
 3. there is some problem with video file

 debugging :

 attach debugger and see adobe flash player is loaded are not.
 once you attach debugger, you get all exceptions of the problem,and anlayze them.
 */
