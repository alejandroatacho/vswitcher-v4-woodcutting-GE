v.getWalking().setDistanceSpreader(8);
WorldPoint[] path = new WorldPoint[]{
    new WorldPoint(3220, 3500, 0),
    new WorldPoint(3209, 3503, 0),
    new WorldPoint(3195, 3497, 0),
    new WorldPoint(3183, 3489, 0),
    new WorldPoint(3168, 3489, 0)
};

if(v.getInventory().inventoryFull()) {
  if (v.getWalking().nearEntity(Entity.GAME, 10059, 20)) {
      if (!v.getWalking().isMoving()) {
          v.getBank().depositAll();
          v.getWalking().clearPathQueue();
      }
  } else {
      v.getWalking().walkPath(path);
  }
} else {
    if(v.getWalking().nearEntity(Entity.GAME, 10823, 20)) {
        if(v.getLocalPlayer().hasAnimation(-1)) {
            v.getWoodcutting().chop(10823);
        }
    } else {
        v.getWalking().walkPathReverse(path);
    }
}